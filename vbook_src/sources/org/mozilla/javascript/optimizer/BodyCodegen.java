package org.mozilla.javascript.optimizer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.ScriptNode;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class BodyCodegen {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ECMAERROR_EXCEPTION = 2;
    private static final int EVALUATOR_EXCEPTION = 1;
    private static final int EXCEPTION_MAX = 5;
    private static final int FINALLY_EXCEPTION = 4;
    static final int GENERATOR_START = 0;
    static final int GENERATOR_TERMINATE = -1;
    static final int GENERATOR_YIELD_START = 1;
    private static final int JAVASCRIPT_EXCEPTION = 0;
    private static final int MAX_LOCALS = 1024;
    private static final String SIGNATURE_CALL0 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final String SIGNATURE_CALL1 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final String SIGNATURE_CALL2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final String SIGNATURE_CALLN = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final int THROWABLE_EXCEPTION = 3;
    private int argsLocal;
    fi1 cfw;
    Codegen codegen;
    CompilerEnvirons compilerEnv;
    private int contextLocal;
    private int enterAreaStartLabel;
    private int epilogueLabel;
    private Map<Node, FinallyReturnPoint> finallys;
    private int firstFreeLocal;
    private OptFunctionNode fnCurrent;
    private int funObjLocal;
    private int generatorStateLocal;
    private int generatorSwitch;
    private boolean hasVarsInRegs;
    private boolean inDirectCallFunction;
    private boolean inLocalBlock;
    private boolean isGenerator;
    private boolean itsForcedObjectParameters;
    private int itsLineNumber;
    private int itsOneArgArray;
    private int itsZeroArgArray;
    private ArrayList<Node> literals;
    private int[] locals;
    private int localsMax;
    private int operationLocal;
    private int popvLocal;
    private int savedCodeOffset;
    private int savedHomeObjectLocal;
    ScriptNode scriptOrFn;
    public int scriptOrFnIndex;
    private int thisObjLocal;
    private int[] varRegisters;
    private int variableObjectLocal;
    private ExceptionManager exceptionManager = new ExceptionManager();
    private int maxLocals = 0;
    private int maxStack = 0;
    private int unnestedYieldCount = 0;
    private IdentityHashMap<Node, String> unnestedYields = new IdentityHashMap<>();

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public class ExceptionManager {
        private ArrayDeque<ExceptionInfo> exceptionInfo = new ArrayDeque<>();

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* loaded from: classes3.dex */
        public class ExceptionInfo {
            Node finallyBlock;
            int[] handlerLabels = new int[5];
            int[] exceptionStarts = new int[5];
            Node currentFinally = null;

            public ExceptionInfo(Jump jump, Node node) {
                this.finallyBlock = node;
            }
        }

        public ExceptionManager() {
        }

        private void endCatch(ExceptionInfo exceptionInfo, int i, int i2) {
            int i3 = exceptionInfo.exceptionStarts[i];
            if (i3 != 0) {
                if (BodyCodegen.this.cfw.C(i3) != BodyCodegen.this.cfw.C(i2)) {
                    BodyCodegen.this.cfw.j(exceptionInfo.exceptionStarts[i], BodyCodegen.exceptionTypeToName(i), i2, exceptionInfo.handlerLabels[i]);
                    return;
                }
                return;
            }
            vs.k("bad exception start");
        }

        private ExceptionInfo getTop() {
            return this.exceptionInfo.getLast();
        }

        public void addHandler(int i, int i2, int i3) {
            ExceptionInfo top = getTop();
            top.handlerLabels[i] = i2;
            top.exceptionStarts[i] = i3;
        }

        public void markInlineFinallyEnd(Node node, int i) {
            Iterator<ExceptionInfo> descendingIterator = this.exceptionInfo.descendingIterator();
            while (descendingIterator.hasNext()) {
                ExceptionInfo next = descendingIterator.next();
                for (int i2 = 0; i2 < 5; i2++) {
                    if (next.handlerLabels[i2] != 0 && next.currentFinally == node) {
                        next.exceptionStarts[i2] = i;
                        next.currentFinally = null;
                    }
                }
                if (next.finallyBlock == node) {
                    return;
                }
            }
        }

        public void markInlineFinallyStart(Node node, int i) {
            Iterator<ExceptionInfo> descendingIterator = this.exceptionInfo.descendingIterator();
            while (descendingIterator.hasNext()) {
                ExceptionInfo next = descendingIterator.next();
                for (int i2 = 0; i2 < 5; i2++) {
                    if (next.handlerLabels[i2] != 0 && next.currentFinally == null) {
                        endCatch(next, i2, i);
                        next.exceptionStarts[i2] = 0;
                        next.currentFinally = node;
                    }
                }
                if (next.finallyBlock == node) {
                    return;
                }
            }
        }

        public void popExceptionInfo() {
            this.exceptionInfo.removeLast();
        }

        public void pushExceptionInfo(Jump jump) {
            this.exceptionInfo.add(new ExceptionInfo(jump, BodyCodegen.getFinallyAtTarget(jump.getFinally())));
        }

        public int removeHandler(int i, int i2) {
            ExceptionInfo top = getTop();
            int i3 = top.handlerLabels[i];
            if (i3 == 0) {
                return 0;
            }
            endCatch(top, i, i2);
            top.handlerLabels[i] = 0;
            return i3;
        }

        public void setHandlers(int[] iArr, int i) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    addHandler(i2, i3, i);
                }
            }
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class FinallyReturnPoint {
        public List<Integer> jsrPoints = new ArrayList();
        public int tableLabel = 0;
    }

    private void addDoubleWrap() {
        addOptRuntimeInvoke("wrapDouble", "(D)Ljava/lang/Double;");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [e02, java.lang.Object] */
    private void addDynamicInvoke(String str, String str2) {
        fi1 fi1Var = this.cfw;
        di1 di1Var = Bootstrapper.BOOTSTRAP_HANDLE;
        Object[] objArr = new Object[0];
        fi1Var.getClass();
        if (fi1.E >= 51) {
            int L = fi1Var.m + ((short) fi1.L(str2));
            if (L >= 0 && 32767 >= L) {
                bi1 bi1Var = new bi1(fi1Var, di1Var, objArr);
                if (fi1Var.B == null) {
                    fi1Var.B = new ArrayList();
                }
                int indexOf = fi1Var.B.indexOf(bi1Var);
                if (indexOf == -1) {
                    indexOf = fi1Var.B.size();
                    fi1Var.B.add(bi1Var);
                    fi1Var.C += bi1Var.a.length;
                }
                h02 h02Var = fi1Var.k;
                h02Var.getClass();
                ?? obj = new Object();
                obj.a = indexOf;
                obj.b = str;
                obj.c = str2;
                obj.d = ((str2.hashCode() * str.hashCode()) + indexOf) ^ 18;
                HashMap hashMap = h02Var.g;
                int intValue = ((Integer) hashMap.getOrDefault(obj, -1)).intValue();
                if (intValue == -1) {
                    short h = h02Var.h(str, str2);
                    h02Var.j(5);
                    byte[] bArr = h02Var.l;
                    int i = h02Var.h;
                    int i2 = i + 1;
                    h02Var.h = i2;
                    bArr[i] = 18;
                    int I = fi1.I(bArr, indexOf, i2);
                    h02Var.h = I;
                    h02Var.h = fi1.I(h02Var.l, h, I);
                    intValue = h02Var.i;
                    h02Var.i = intValue + 1;
                    hashMap.put(obj, Integer.valueOf(intValue));
                    h02Var.m(intValue, str2);
                    h02Var.k.put(Integer.valueOf(intValue), (byte) 18);
                }
                fi1Var.x(Token.QUESTION_DOT);
                fi1Var.y((short) intValue);
                fi1Var.y(0);
                short s = (short) L;
                fi1Var.m = s;
                if (L > fi1Var.n) {
                    fi1Var.n = s;
                    return;
                }
                return;
            }
            fi1.A(L);
            throw null;
        }
        cy7.e("Please build and run with JDK 1.7 for invokedynamic support");
    }

    private void addGoto(Node node, int i) {
        this.cfw.d(i, getTargetLabel(node));
    }

    private void addGotoWithReturn(Node node) {
        FinallyReturnPoint finallyReturnPoint = this.finallys.get(node);
        this.cfw.o(finallyReturnPoint.jsrPoints.size());
        addGoto(node, Token.LET);
        this.cfw.c(87);
        int b = this.cfw.b();
        this.cfw.D(b);
        finallyReturnPoint.jsrPoints.add(Integer.valueOf(b));
    }

    private void addInstructionCount(int i) {
        this.cfw.g(this.contextLocal);
        this.cfw.r(i);
        addScriptRuntimeInvoke("addInstructionCount", "(Lorg/mozilla/javascript/Context;I)V");
    }

    private void addJumpedBooleanWrap(int i, int i2) {
        this.cfw.D(i2);
        int b = this.cfw.b();
        this.cfw.f("java/lang/Boolean", "FALSE", Token.ARROW, "Ljava/lang/Boolean;");
        this.cfw.d(Token.LET, b);
        this.cfw.D(i);
        this.cfw.f("java/lang/Boolean", "TRUE", Token.ARROW, "Ljava/lang/Boolean;");
        this.cfw.D(b);
        this.cfw.z();
    }

    private void addLoadProperty(Node node, Node node2, Object[] objArr, int i) {
        int i2 = 0;
        if (i == 0) {
            addNewObjectArray(0);
            addNewObjectArray(0);
        } else if (this.isGenerator) {
            while (i2 < i) {
                addLoadPropertyId(node, objArr, i2);
                addLoadPropertyValue(node, node2);
                node2 = node2.getNext();
                i2++;
            }
            int i3 = this.firstFreeLocal;
            int i4 = i3 + 1;
            int i5 = this.localsMax;
            this.firstFreeLocal = i3 + 2;
            this.localsMax = i5 + 2;
            addNewObjectArray(i);
            this.cfw.h(i3);
            addNewObjectArray(i);
            this.cfw.h(i4);
            while (true) {
                i--;
                fi1 fi1Var = this.cfw;
                if (i >= 0) {
                    fi1Var.g(i4);
                    this.cfw.c(95);
                    this.cfw.o(i);
                    this.cfw.c(95);
                    this.cfw.c(83);
                    this.cfw.g(i3);
                    this.cfw.c(95);
                    this.cfw.o(i);
                    this.cfw.c(95);
                    this.cfw.c(83);
                } else {
                    fi1Var.g(i3);
                    this.cfw.g(i4);
                    return;
                }
            }
        } else {
            addNewObjectArray(i);
            addNewObjectArray(i);
            while (true) {
                fi1 fi1Var2 = this.cfw;
                if (i2 < i) {
                    fi1Var2.c(92);
                    this.cfw.o(i2);
                    addLoadPropertyId(node, objArr, i2);
                    this.cfw.c(83);
                    this.cfw.o(i2);
                    addLoadPropertyValue(node, node2);
                    this.cfw.c(83);
                    node2 = node2.getNext();
                    i2++;
                } else {
                    fi1Var2.c(95);
                    return;
                }
            }
        }
    }

    private void addLoadPropertyId(Node node, Object[] objArr, int i) {
        Object obj = objArr[i];
        if (obj instanceof Node) {
            generateExpression(((Node) obj).getFirstChild(), node);
            return;
        }
        boolean z = obj instanceof String;
        fi1 fi1Var = this.cfw;
        if (z) {
            fi1Var.s((String) obj);
            return;
        }
        fi1Var.r(((Integer) obj).intValue());
        addScriptRuntimeInvoke("wrapInt", "(I)Ljava/lang/Integer;");
    }

    private void addLoadPropertyValue(Node node, Node node2) {
        int type = node2.getType();
        if (type != 165 && type != 166 && type != 177) {
            generateExpression(node2, node);
        } else {
            generateExpression(node2.getFirstChild(), node);
        }
    }

    private void addNewObjectArray(int i) {
        if (i == 0) {
            int i2 = this.itsZeroArgArray;
            fi1 fi1Var = this.cfw;
            if (i2 >= 0) {
                fi1Var.g(i2);
                return;
            } else {
                fi1Var.f("org/mozilla/javascript/ScriptRuntime", "emptyArgs", Token.ARROW, "[Ljava/lang/Object;");
                return;
            }
        }
        this.cfw.r(i);
        this.cfw.e(189, "java/lang/Object");
    }

    private void addObjectToDouble() {
        addDynamicInvoke("MATH:TONUMBER", Signatures.MATH_TO_NUMBER);
    }

    private void addObjectToNumeric() {
        addDynamicInvoke("MATH:TONUMERIC", Signatures.MATH_TO_NUMERIC);
    }

    private void addOptRuntimeInvoke(String str, String str2) {
        this.cfw.m("org/mozilla/javascript/optimizer/OptRuntime", str, Token.DOTDOTDOT, str2);
    }

    private void addScriptRuntimeInvoke(String str, String str2) {
        this.cfw.m("org.mozilla.javascript.ScriptRuntime", str, Token.DOTDOTDOT, str2);
    }

    private static int countArguments(Node node) {
        int i = 0;
        while (node != null) {
            i++;
            node = node.getNext();
        }
        return i;
    }

    private void dcpLoadAsNumber(int i) {
        this.cfw.g(i);
        this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
        int b = this.cfw.b();
        this.cfw.d(Token.GET, b);
        fi1 fi1Var = this.cfw;
        int i2 = fi1Var.m;
        fi1Var.g(i);
        addObjectToDouble();
        int b2 = this.cfw.b();
        this.cfw.d(Token.LET, b2);
        this.cfw.E(b, i2);
        this.cfw.i(i + 1);
        this.cfw.D(b2);
    }

    private void dcpLoadAsObject(int i) {
        this.cfw.g(i);
        this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
        int b = this.cfw.b();
        this.cfw.d(Token.GET, b);
        fi1 fi1Var = this.cfw;
        int i2 = fi1Var.m;
        fi1Var.g(i);
        int b2 = this.cfw.b();
        this.cfw.d(Token.LET, b2);
        this.cfw.E(b, i2);
        this.cfw.i(i + 1);
        addDoubleWrap();
        this.cfw.D(b2);
    }

    private void decReferenceWordLocal(int i) {
        int[] iArr = this.locals;
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String exceptionTypeToName(int i) {
        if (i == 0) {
            return "org/mozilla/javascript/JavaScriptException";
        }
        if (i == 1) {
            return "org/mozilla/javascript/EvaluatorException";
        }
        if (i == 2) {
            return "org/mozilla/javascript/EcmaError";
        }
        if (i == 3) {
            return "java/lang/Throwable";
        }
        if (i == 4) {
            return null;
        }
        throw Kit.codeBug();
    }

    private Node findNestedYield(Node node) {
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            if (firstChild.getType() != 78 && firstChild.getType() != 179) {
                Node findNestedYield = findNestedYield(firstChild);
                if (findNestedYield != null) {
                    return findNestedYield;
                }
            } else {
                return firstChild;
            }
        }
        return null;
    }

    private void finishGetElemGeneration(Node node, Node node2) {
        generateExpression(node2.getNext(), node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (node.getIntProp(31, 0) == 1) {
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke("PROP:GETELEMENTSUPER", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
        } else if (node.getIntProp(8, -1) != -1) {
            addDynamicInvoke("PROP:GETINDEX", Signatures.PROP_GET_INDEX);
        } else {
            addDynamicInvoke("PROP:GETELEMENT", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        }
    }

    private void finishGetPropGeneration(Node node, Node node2) {
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        int i = 0;
        if (node.getIntProp(31, 0) == 1) {
            this.cfw.g(this.thisObjLocal);
            fi1 fi1Var = this.cfw;
            if (node.getType() == 34) {
                i = 1;
            }
            fi1Var.o(i);
            addDynamicInvoke(s21.m("PROP:GETSUPER:", node2.getString()), Signatures.PROP_GET_SUPER);
        } else if (node.getType() == 34) {
            addDynamicInvoke(s21.m("PROP:GETNOWARN:", node2.getString()), "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        } else {
            addDynamicInvoke(s21.m("PROP:GET:", node2.getString()), "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        }
    }

    private void finishGetRefGeneration() {
        this.cfw.g(this.contextLocal);
        addScriptRuntimeInvoke("refGet", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
    }

    private void finishRefSpecialGeneration(Node node) {
        this.cfw.s((String) node.getProp(17));
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("specialRef", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Ref;");
    }

    private void genSimpleCompare(int i, int i2, int i3) {
        if (i2 != -1) {
            switch (i) {
                case 14:
                    this.cfw.c(Token.USE_STACK);
                    this.cfw.d(Token.LOCAL_BLOCK, i2);
                    break;
                case 15:
                    this.cfw.c(Token.USE_STACK);
                    this.cfw.d(Token.COLONCOLON, i2);
                    break;
                case 16:
                    this.cfw.c(Token.TYPEOFNAME);
                    this.cfw.d(Token.DOTDOT, i2);
                    break;
                case 17:
                    this.cfw.c(Token.TYPEOFNAME);
                    this.cfw.d(Token.SET_REF_OP, i2);
                    break;
                default:
                    throw Codegen.badTree();
            }
            if (i3 != -1) {
                this.cfw.d(Token.LET, i3);
                return;
            }
            return;
        }
        throw Codegen.badTree();
    }

    private void generateActivationExit() {
        if (this.fnCurrent != null && !this.hasVarsInRegs) {
            this.cfw.g(this.contextLocal);
            addScriptRuntimeInvoke("exitActivationFunction", "(Lorg/mozilla/javascript/Context;)V");
            return;
        }
        throw Kit.codeBug();
    }

    private void generateArrayLiteralFactory(Node node, int i) {
        String m = a82.m(this.codegen.getBodyMethodName(this.scriptOrFn), "_literal", i);
        initBodyGeneration();
        int i2 = this.firstFreeLocal;
        int i3 = i2 + 1;
        this.firstFreeLocal = i3;
        this.argsLocal = i2;
        this.localsMax = i3;
        this.cfw.N(m, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short) 2);
        visitArrayLiteral(node, node.getFirstChild(), true);
        this.cfw.c(Token.GENEXPR);
        this.cfw.O((short) (this.localsMax + 1));
    }

    private void generateCallArgArray(Node node, Node node2, boolean z) {
        int i;
        int countArguments = countArguments(node2);
        if (countArguments == 1 && (i = this.itsOneArgArray) >= 0) {
            this.cfw.g(i);
        } else {
            addNewObjectArray(countArguments);
        }
        for (int i2 = 0; i2 != countArguments; i2++) {
            if (!this.isGenerator) {
                this.cfw.c(89);
                this.cfw.r(i2);
            }
            if (!z) {
                generateExpression(node2, node);
            } else {
                int nodeIsDirectCallParameter = nodeIsDirectCallParameter(node2);
                if (nodeIsDirectCallParameter >= 0) {
                    dcpLoadAsObject(nodeIsDirectCallParameter);
                } else {
                    generateExpression(node2, node);
                    if (node2.getIntProp(8, -1) == 0) {
                        addDoubleWrap();
                    }
                }
            }
            if (this.isGenerator) {
                short newWordLocal = getNewWordLocal();
                this.cfw.h(newWordLocal);
                this.cfw.e(192, "[Ljava/lang/Object;");
                this.cfw.c(89);
                this.cfw.r(i2);
                this.cfw.g(newWordLocal);
                releaseWordLocal(newWordLocal);
            }
            this.cfw.c(83);
            node2 = node2.getNext();
        }
    }

    private void generateCatchBlock(int i, short s, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = this.cfw.b();
        }
        fi1 fi1Var = this.cfw;
        fi1Var.m = 1;
        fi1Var.D(i4);
        this.cfw.h(i3);
        this.cfw.g(s);
        this.cfw.h(this.variableObjectLocal);
        this.cfw.d(Token.LET, i2);
    }

    private void generateCheckForThrowOrClose(int i, boolean z, int i2) {
        int b = this.cfw.b();
        int b2 = this.cfw.b();
        this.cfw.D(b);
        this.cfw.g(this.argsLocal);
        generateThrowJavaScriptException();
        this.cfw.D(b2);
        this.cfw.g(this.argsLocal);
        this.cfw.e(192, "java/lang/Throwable");
        this.cfw.c(191);
        if (i != -1) {
            this.cfw.D(i);
        }
        if (!z) {
            this.cfw.F(this.generatorSwitch, i2);
        }
        this.cfw.l(this.operationLocal);
        this.cfw.o(2);
        this.cfw.d(Token.XML, b2);
        this.cfw.l(this.operationLocal);
        this.cfw.o(1);
        this.cfw.d(Token.XML, b);
    }

    private void generateEpilogue() {
        fi1 fi1Var;
        if (this.compilerEnv.isGenerateObserverCount()) {
            addInstructionCount();
        }
        if (this.isGenerator) {
            Map<Node, int[]> liveLocals = ((FunctionNode) this.scriptOrFn).getLiveLocals();
            if (liveLocals != null) {
                for (Node node : ((FunctionNode) this.scriptOrFn).getResumptionPoints()) {
                    int[] iArr = liveLocals.get(node);
                    if (iArr != null) {
                        this.cfw.F(this.generatorSwitch, getNextGeneratorState(node));
                        generateGetGeneratorLocalsState();
                        int i = 0;
                        while (true) {
                            int length = iArr.length;
                            fi1Var = this.cfw;
                            if (i >= length) {
                                break;
                            }
                            fi1Var.c(89);
                            this.cfw.o(i);
                            this.cfw.c(50);
                            this.cfw.h(iArr[i]);
                            i++;
                        }
                        fi1Var.c(87);
                        this.cfw.d(Token.LET, getTargetLabel(node));
                    }
                }
            }
            Map<Node, FinallyReturnPoint> map = this.finallys;
            if (map != null) {
                for (Map.Entry<Node, FinallyReturnPoint> entry : map.entrySet()) {
                    if (entry.getKey().getType() == 138) {
                        FinallyReturnPoint value = entry.getValue();
                        this.cfw.E(value.tableLabel, 1);
                        int w = this.cfw.w(0, value.jsrPoints.size() - 1);
                        this.cfw.H(w);
                        int i2 = 0;
                        for (int i3 = 0; i3 < value.jsrPoints.size(); i3++) {
                            this.cfw.F(w, i2);
                            this.cfw.d(Token.LET, value.jsrPoints.get(i3).intValue());
                            i2++;
                        }
                    }
                }
            }
        }
        int i4 = this.epilogueLabel;
        if (i4 != -1) {
            this.cfw.D(i4);
        }
        if (this.isGenerator) {
            if (((FunctionNode) this.scriptOrFn).getResumptionPoints() != null) {
                this.cfw.H(this.generatorSwitch);
            }
            generateSetGeneratorResumptionPoint(-1);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.generatorStateLocal);
            addOptRuntimeInvoke("throwStopIteration", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            Codegen.pushUndefined(this.cfw);
            this.cfw.c(Token.GENEXPR);
        } else if (this.hasVarsInRegs) {
            this.cfw.c(Token.GENEXPR);
        } else if (this.fnCurrent == null) {
            this.cfw.g(this.popvLocal);
            this.cfw.c(Token.GENEXPR);
        } else {
            generateActivationExit();
            this.cfw.c(Token.GENEXPR);
            int b = this.cfw.b();
            fi1 fi1Var2 = this.cfw;
            fi1Var2.m = 1;
            fi1Var2.D(b);
            short newWordLocal = getNewWordLocal();
            this.cfw.h(newWordLocal);
            generateActivationExit();
            this.cfw.g(newWordLocal);
            releaseWordLocal(newWordLocal);
            this.cfw.c(191);
            this.cfw.j(this.enterAreaStartLabel, null, this.epilogueLabel, b);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Removed duplicated region for block: B:190:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0662  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void generateExpression(org.mozilla.javascript.Node r19, org.mozilla.javascript.Node r20) {
        /*
            Method dump skipped, instructions count: 1960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.BodyCodegen.generateExpression(org.mozilla.javascript.Node, org.mozilla.javascript.Node):void");
    }

    private void generateFunctionAndThisObj(Node node, Node node2) {
        String str;
        String str2;
        int type = node.getType();
        boolean z = false;
        if (node2.getIntProp(30, 0) == 1) {
            z = true;
        }
        int type2 = node.getType();
        String str3 = "GETWITHTHIS";
        if (type2 != 33) {
            if (type2 != 34) {
                if (type2 != 39) {
                    if (type2 != 44) {
                        generateExpression(node, node2);
                        this.cfw.g(this.contextLocal);
                        if (z) {
                            str2 = "getValueFunctionAndThisOptional";
                        } else {
                            str2 = "getValueFunctionAndThis";
                        }
                        addScriptRuntimeInvoke(str2, "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Callable;");
                        return;
                    }
                    String string = node.getString();
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.g(this.contextLocal);
                    if (z) {
                        str3 = "GETWITHTHISOPTIONAL";
                    }
                    addDynamicInvoke(eub.p("NAME:", str3, ":", string), Signatures.NAME_GET_THIS);
                    return;
                }
            } else {
                throw Kit.codeBug();
            }
        }
        Node firstChild = node.getFirstChild();
        generateExpression(firstChild, node);
        Node next = firstChild.getNext();
        if (type == 33) {
            String string2 = next.getString();
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            if (z) {
                str3 = "GETWITHTHISOPTIONAL";
            }
            addDynamicInvoke(eub.p("PROP:", str3, ":", string2), Signatures.PROP_GET_THIS);
            return;
        }
        generateExpression(next, node);
        if (node.getIntProp(8, -1) != -1) {
            addDoubleWrap();
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (z) {
            str = "getElemFunctionAndThisOptional";
        } else {
            str = "getElemFunctionAndThis";
        }
        addScriptRuntimeInvoke(str, "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;");
    }

    private void generateGenerator() {
        this.cfw.N(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short) 10);
        initBodyGeneration();
        int i = this.firstFreeLocal;
        int i2 = i + 1;
        this.firstFreeLocal = i2;
        this.argsLocal = i;
        this.localsMax = i2;
        if (this.fnCurrent != null) {
            this.cfw.g(this.funObjLocal);
            this.cfw.m("org/mozilla/javascript/Scriptable", "getParentScope", 185, "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.variableObjectLocal);
        }
        this.cfw.g(this.funObjLocal);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.argsLocal);
        this.cfw.t(this.scriptOrFn.isInStrictMode());
        this.cfw.t(this.scriptOrFn.hasRestParameter());
        this.cfw.p();
        this.cfw.m("org/mozilla/javascript/BaseFunction", "getHomeObject", Token.TEMPLATE_LITERAL_SUBST, "()Lorg/mozilla/javascript/Scriptable;");
        addScriptRuntimeInvoke("createFunctionActivation", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;ZZLorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.h(this.variableObjectLocal);
        this.cfw.e(Token.LAST_TOKEN, this.codegen.mainClassName);
        this.cfw.c(89);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.contextLocal);
        this.cfw.r(this.scriptOrFnIndex);
        this.cfw.m(this.codegen.mainClassName, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        generateNestedFunctionInits();
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.thisObjLocal);
        this.cfw.o(this.maxLocals);
        this.cfw.o(this.maxStack);
        addOptRuntimeInvoke("createNativeGenerator", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;II)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.c(Token.GENEXPR);
        this.cfw.O((short) (this.localsMax + 1));
    }

    private void generateGetGeneratorLocalsState() {
        this.cfw.g(this.generatorStateLocal);
        addOptRuntimeInvoke("getGeneratorLocalsState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateGetGeneratorResumptionPoint() {
        this.cfw.g(this.generatorStateLocal);
        this.cfw.f("org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "resumptionPoint", 180, "I");
    }

    private void generateGetGeneratorStackState() {
        this.cfw.g(this.generatorStateLocal);
        addOptRuntimeInvoke("getGeneratorStackState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateIfJump(Node node, Node node2, int i, int i2) {
        int type = node.getType();
        Node firstChild = node.getFirstChild();
        if (type != 26) {
            if (type != 51 && type != 52) {
                if (type != 57 && type != 58) {
                    if (type != 117 && type != 118) {
                        switch (type) {
                            case 12:
                            case 13:
                                break;
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                break;
                            default:
                                generateExpression(node, node2);
                                addDynamicInvoke("MATH:TOBOOLEAN", Signatures.MATH_TO_BOOLEAN);
                                this.cfw.d(Token.SETELEM_OP, i);
                                this.cfw.d(Token.LET, i2);
                                return;
                        }
                    } else {
                        int b = this.cfw.b();
                        if (type == 118) {
                            generateIfJump(firstChild, node, b, i2);
                        } else {
                            generateIfJump(firstChild, node, i, b);
                        }
                        this.cfw.D(b);
                        generateIfJump(firstChild.getNext(), node, i, i2);
                        return;
                    }
                }
                visitIfJumpRelOp(node, firstChild, i, i2);
                return;
            }
            visitIfJumpEqOp(node, firstChild, i, i2);
            return;
        }
        generateIfJump(firstChild, node, i2, i);
    }

    private void generateIntegerUnwrap() {
        this.cfw.m("java/lang/Integer", "intValue", Token.TEMPLATE_LITERAL_SUBST, "()I");
    }

    private void generateIntegerWrap() {
        this.cfw.m("java/lang/Integer", "valueOf", Token.DOTDOTDOT, "(I)Ljava/lang/Integer;");
    }

    private void generateLocalYieldPoint(Node node, boolean z) {
        fi1 fi1Var;
        fi1 fi1Var2;
        int i = this.cfw.m;
        int i2 = this.maxStack;
        if (i2 <= i) {
            i2 = i;
        }
        this.maxStack = i2;
        if (i != 0) {
            generateGetGeneratorStackState();
            int i3 = 0;
            while (true) {
                fi1Var2 = this.cfw;
                if (i3 >= i) {
                    break;
                }
                fi1Var2.c(90);
                this.cfw.c(95);
                this.cfw.o(i3);
                this.cfw.c(95);
                this.cfw.c(83);
                i3++;
            }
            fi1Var2.c(87);
        }
        Node firstChild = node.getFirstChild();
        if (firstChild != null) {
            generateExpression(firstChild, node);
        } else {
            Codegen.pushUndefined(this.cfw);
        }
        if (node.getType() == 179) {
            this.cfw.e(Token.LAST_TOKEN, "org/mozilla/javascript/ES6Generator$YieldStarResult");
            this.cfw.c(90);
            this.cfw.c(95);
            this.cfw.m("org/mozilla/javascript/ES6Generator$YieldStarResult", "<init>", Token.TAGGED_TEMPLATE_LITERAL, "(Ljava/lang/Object;)V");
        }
        int nextGeneratorState = getNextGeneratorState(node);
        generateSetGeneratorResumptionPoint(nextGeneratorState);
        boolean generateSaveLocals = generateSaveLocals(node);
        this.cfw.c(Token.GENEXPR);
        generateCheckForThrowOrClose(getTargetLabel(node), generateSaveLocals, nextGeneratorState);
        if (i != 0) {
            generateGetGeneratorStackState();
            while (true) {
                i--;
                fi1Var = this.cfw;
                if (i < 0) {
                    break;
                }
                fi1Var.c(89);
                this.cfw.o(i);
                this.cfw.c(50);
                this.cfw.c(95);
            }
            fi1Var.c(87);
        }
        if (z) {
            this.cfw.g(this.argsLocal);
        }
    }

    private void generateNestedFunctionInits() {
        int functionCount = this.scriptOrFn.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn, i);
            if (optFunctionNode.fnode.getFunctionType() == 1) {
                visitFunction(optFunctionNode, 1);
            }
        }
    }

    private void generateObjectLiteralFactory(Node node, int i) {
        String m = a82.m(this.codegen.getBodyMethodName(this.scriptOrFn), "_literal", i);
        initBodyGeneration();
        int i2 = this.firstFreeLocal;
        int i3 = i2 + 1;
        this.firstFreeLocal = i3;
        this.argsLocal = i2;
        this.localsMax = i3;
        this.cfw.N(m, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short) 2);
        visitObjectLiteral(node, node.getFirstChild(), true);
        this.cfw.c(Token.GENEXPR);
        this.cfw.O((short) (this.localsMax + 1));
    }

    private void generatePrologue() {
        boolean z;
        String str;
        String str2;
        int newWordLocal;
        String str3;
        int i;
        if (this.inDirectCallFunction) {
            int paramCount = this.scriptOrFn.getParamCount();
            if (this.firstFreeLocal != 4) {
                Kit.codeBug();
            }
            for (int i2 = 0; i2 != paramCount; i2++) {
                int[] iArr = this.varRegisters;
                int i3 = this.firstFreeLocal;
                iArr[i2] = i3;
                this.firstFreeLocal = i3 + 3;
            }
            if (!this.fnCurrent.getParameterNumberContext()) {
                this.itsForcedObjectParameters = true;
                for (int i4 = 0; i4 != paramCount; i4++) {
                    int i5 = this.varRegisters[i4];
                    this.cfw.g(i5);
                    this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
                    int b = this.cfw.b();
                    this.cfw.d(Token.SET, b);
                    this.cfw.i(i5 + 1);
                    addDoubleWrap();
                    this.cfw.h(i5);
                    this.cfw.D(b);
                }
            }
        }
        if (this.fnCurrent != null) {
            this.cfw.g(this.funObjLocal);
            this.cfw.m("org/mozilla/javascript/Scriptable", "getParentScope", 185, "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.variableObjectLocal);
        }
        int i6 = this.firstFreeLocal;
        int i7 = i6 + 1;
        this.firstFreeLocal = i7;
        this.argsLocal = i6;
        this.localsMax = i7;
        if (this.isGenerator) {
            int i8 = i6 + 2;
            this.firstFreeLocal = i8;
            this.operationLocal = i7;
            this.localsMax = i8;
            this.cfw.g(this.thisObjLocal);
            int i9 = this.firstFreeLocal;
            int i10 = i9 + 1;
            this.firstFreeLocal = i10;
            this.generatorStateLocal = i9;
            this.localsMax = i10;
            this.cfw.e(192, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState");
            this.cfw.c(89);
            this.cfw.h(this.generatorStateLocal);
            this.cfw.f("org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "thisObj", 180, "Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.thisObjLocal);
            if (this.epilogueLabel == -1) {
                this.epilogueLabel = this.cfw.b();
            }
            List<Node> resumptionPoints = ((FunctionNode) this.scriptOrFn).getResumptionPoints();
            if (resumptionPoints != null) {
                generateGetGeneratorResumptionPoint();
                this.generatorSwitch = this.cfw.w(0, resumptionPoints.size());
                generateCheckForThrowOrClose(-1, false, 0);
            }
        }
        if (this.fnCurrent == null) {
            if (this.scriptOrFn.getRegexpCount() != 0) {
                this.cfw.g(this.contextLocal);
                this.cfw.m(this.codegen.mainClassName, "_reInit", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;)V");
            }
            if (this.scriptOrFn.getTemplateLiteralCount() != 0) {
                this.cfw.m(this.codegen.mainClassName, "_qInit", Token.DOTDOTDOT, "()V");
            }
        }
        if (this.compilerEnv.isGenerateObserverCount()) {
            saveCurrentCodeOffset();
        }
        if (!this.isGenerator) {
            boolean z2 = this.hasVarsInRegs;
            ScriptNode scriptNode = this.scriptOrFn;
            if (z2) {
                int paramCount2 = scriptNode.getParamCount();
                if (paramCount2 > 0 && !this.inDirectCallFunction) {
                    boolean hasRestParameter = this.scriptOrFn.hasRestParameter();
                    fi1 fi1Var = this.cfw;
                    if (hasRestParameter) {
                        fi1Var.g(this.contextLocal);
                        this.cfw.g(this.variableObjectLocal);
                        this.cfw.g(this.argsLocal);
                        this.cfw.r(paramCount2);
                        addScriptRuntimeInvoke("padAndRestArguments", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;I)[Ljava/lang/Object;");
                        this.cfw.h(this.argsLocal);
                    } else {
                        fi1Var.g(this.argsLocal);
                        this.cfw.c(190);
                        this.cfw.r(paramCount2);
                        int b2 = this.cfw.b();
                        this.cfw.d(Token.XMLEND, b2);
                        this.cfw.g(this.argsLocal);
                        this.cfw.r(paramCount2);
                        addScriptRuntimeInvoke("padArguments", "([Ljava/lang/Object;I)[Ljava/lang/Object;");
                        this.cfw.h(this.argsLocal);
                        this.cfw.D(b2);
                    }
                }
                int paramCount3 = this.fnCurrent.fnode.getParamCount();
                int paramAndVarCount = this.fnCurrent.fnode.getParamAndVarCount();
                boolean[] paramAndVarConst = this.fnCurrent.fnode.getParamAndVarConst();
                int i11 = -1;
                for (int i12 = 0; i12 != paramAndVarCount; i12++) {
                    if (i12 < paramCount3) {
                        if (!this.inDirectCallFunction) {
                            newWordLocal = getNewWordLocal();
                            this.cfw.g(this.argsLocal);
                            this.cfw.r(i12);
                            this.cfw.c(50);
                            this.cfw.h(newWordLocal);
                        } else {
                            newWordLocal = -1;
                        }
                    } else if (this.fnCurrent.isNumberVar(i12)) {
                        newWordLocal = getNewWordPairLocal(paramAndVarConst[i12]);
                        this.cfw.q(0.0d);
                        this.cfw.Q(71, 57, newWordLocal);
                    } else {
                        newWordLocal = getNewWordLocal(paramAndVarConst[i12]);
                        fi1 fi1Var2 = this.cfw;
                        if (i11 == -1) {
                            Codegen.pushUndefined(fi1Var2);
                            i11 = newWordLocal;
                        } else {
                            fi1Var2.g(i11);
                        }
                        this.cfw.h(newWordLocal);
                    }
                    if (newWordLocal >= 0) {
                        if (paramAndVarConst[i12]) {
                            this.cfw.r(0);
                            fi1 fi1Var3 = this.cfw;
                            if (this.fnCurrent.isNumberVar(i12)) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                            fi1Var3.Q(59, 54, i + newWordLocal);
                        }
                        this.varRegisters[i12] = newWordLocal;
                    }
                    if (this.compilerEnv.isGenerateDebugInfo()) {
                        String paramOrVarName = this.fnCurrent.fnode.getParamOrVarName(i12);
                        if (this.fnCurrent.isNumberVar(i12)) {
                            str3 = "D";
                        } else {
                            str3 = "Ljava/lang/Object;";
                        }
                        fi1 fi1Var4 = this.cfw;
                        int i13 = fi1Var4.j;
                        if (newWordLocal < 0) {
                            newWordLocal = this.varRegisters[i12];
                        }
                        h02 h02Var = fi1Var4.k;
                        int[] iArr2 = {h02Var.i(paramOrVarName), h02Var.i(str3), i13, newWordLocal};
                        if (fi1Var4.A == null) {
                            fi1Var4.A = new ArrayList();
                        }
                        fi1Var4.A.add(iArr2);
                    }
                }
                return;
            }
            if ((scriptNode instanceof FunctionNode) && ((FunctionNode) scriptNode).getFunctionType() == 4) {
                z = true;
            } else {
                z = false;
            }
            OptFunctionNode optFunctionNode = this.fnCurrent;
            fi1 fi1Var5 = this.cfw;
            int i14 = this.funObjLocal;
            if (optFunctionNode != null) {
                fi1Var5.g(i14);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.argsLocal);
                this.cfw.t(this.scriptOrFn.isInStrictMode());
                this.cfw.t(this.scriptOrFn.hasRestParameter());
                fi1 fi1Var6 = this.cfw;
                if (!z) {
                    fi1Var6.p();
                    this.cfw.m("org/mozilla/javascript/BaseFunction", "getHomeObject", Token.TEMPLATE_LITERAL_SUBST, "()Lorg/mozilla/javascript/Scriptable;");
                } else {
                    int b3 = fi1Var6.b();
                    int b4 = this.cfw.b();
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.e(193, "org/mozilla/javascript/NativeCall");
                    this.cfw.d(Token.SETPROP_OP, b3);
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.e(192, "org/mozilla/javascript/NativeCall");
                    this.cfw.m("org/mozilla/javascript/NativeCall", "getHomeObject", Token.TEMPLATE_LITERAL_SUBST, "()Lorg/mozilla/javascript/Scriptable;");
                    this.cfw.d(Token.LET, b4);
                    this.cfw.D(b3);
                    this.cfw.c(1);
                    this.cfw.D(b4);
                }
                if (z) {
                    str2 = "createArrowFunctionActivation";
                } else {
                    str2 = "createFunctionActivation";
                }
                addScriptRuntimeInvoke(str2, "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;ZZLorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                this.cfw.h(this.variableObjectLocal);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                addScriptRuntimeInvoke("enterActivationFunction", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
                str = "activation";
            } else {
                fi1Var5.g(i14);
                this.cfw.g(this.thisObjLocal);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.r(0);
                addScriptRuntimeInvoke("initScript", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Z)V");
                str = "global";
            }
            this.enterAreaStartLabel = this.cfw.b();
            this.epilogueLabel = this.cfw.b();
            this.cfw.D(this.enterAreaStartLabel);
            generateNestedFunctionInits();
            if (this.compilerEnv.isGenerateDebugInfo()) {
                fi1 fi1Var7 = this.cfw;
                int i15 = fi1Var7.j;
                int i16 = this.variableObjectLocal;
                h02 h02Var2 = fi1Var7.k;
                int[] iArr3 = {h02Var2.i(str), h02Var2.i("Lorg/mozilla/javascript/Scriptable;"), i15, i16};
                if (fi1Var7.A == null) {
                    fi1Var7.A = new ArrayList();
                }
                fi1Var7.A.add(iArr3);
            }
            OptFunctionNode optFunctionNode2 = this.fnCurrent;
            if (optFunctionNode2 == null) {
                this.popvLocal = getNewWordLocal();
                Codegen.pushUndefined(this.cfw);
                this.cfw.h(this.popvLocal);
                int endLineno = this.scriptOrFn.getEndLineno();
                if (endLineno != -1) {
                    this.cfw.n((short) endLineno);
                    return;
                }
                return;
            }
            if (optFunctionNode2.itsContainsCalls0) {
                this.itsZeroArgArray = getNewWordLocal();
                this.cfw.f("org/mozilla/javascript/ScriptRuntime", "emptyArgs", Token.ARROW, "[Ljava/lang/Object;");
                this.cfw.h(this.itsZeroArgArray);
            }
            if (this.fnCurrent.itsContainsCalls1) {
                this.itsOneArgArray = getNewWordLocal();
                this.cfw.r(1);
                this.cfw.e(189, "java/lang/Object");
                this.cfw.h(this.itsOneArgArray);
            }
        }
    }

    private boolean generateSaveLocals(Node node) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.firstFreeLocal; i3++) {
            if (this.locals[i3] != 0) {
                i2++;
            }
        }
        if (i2 == 0) {
            ((FunctionNode) this.scriptOrFn).addLiveLocals(node, null);
            return false;
        }
        int i4 = this.maxLocals;
        if (i4 <= i2) {
            i4 = i2;
        }
        this.maxLocals = i4;
        int[] iArr = new int[i2];
        int i5 = 0;
        for (int i6 = 0; i6 < this.firstFreeLocal; i6++) {
            if (this.locals[i6] != 0) {
                iArr[i5] = i6;
                i5++;
            }
        }
        ((FunctionNode) this.scriptOrFn).addLiveLocals(node, iArr);
        generateGetGeneratorLocalsState();
        while (true) {
            fi1 fi1Var = this.cfw;
            if (i < i2) {
                fi1Var.c(89);
                this.cfw.o(i);
                this.cfw.g(iArr[i]);
                this.cfw.c(83);
                i++;
            } else {
                fi1Var.c(87);
                return true;
            }
        }
    }

    private void generateSetGeneratorResumptionPoint(int i) {
        this.cfw.g(this.generatorStateLocal);
        this.cfw.o(i);
        this.cfw.f("org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "resumptionPoint", Token.TEMPLATE_CHARS, "I");
    }

    private void generateSetGeneratorReturnValue() {
        this.cfw.g(this.generatorStateLocal);
        this.cfw.c(95);
        addOptRuntimeInvoke("setGeneratorReturnValue", "(Ljava/lang/Object;Ljava/lang/Object;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void generateStatement(org.mozilla.javascript.Node r9) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.BodyCodegen.generateStatement(org.mozilla.javascript.Node):void");
    }

    private void generateThrowJavaScriptException() {
        this.cfw.e(Token.LAST_TOKEN, "org/mozilla/javascript/JavaScriptException");
        this.cfw.c(90);
        this.cfw.c(95);
        this.cfw.s(this.scriptOrFn.getSourceName());
        this.cfw.r(this.itsLineNumber);
        this.cfw.m("org/mozilla/javascript/JavaScriptException", "<init>", Token.TAGGED_TEMPLATE_LITERAL, "(Ljava/lang/Object;Ljava/lang/String;I)V");
        this.cfw.c(191);
    }

    private void generateYieldPoint(Node node, boolean z) {
        if (this.unnestedYields.containsKey(node)) {
            if (z) {
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                addDynamicInvoke("PROP:GETNOWARN:" + this.unnestedYields.get(node), "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
                return;
            }
            return;
        }
        Node findNestedYield = findNestedYield(node);
        if (findNestedYield != null) {
            generateYieldPoint(findNestedYield, true);
            String j = a82.j(this.unnestedYieldCount, "__nested__yield__");
            this.unnestedYieldCount++;
            this.cfw.g(this.variableObjectLocal);
            this.cfw.c(95);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            addDynamicInvoke("PROP:SET:".concat(j), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
            this.cfw.c(87);
            this.unnestedYields.put(findNestedYield, j);
        }
        generateLocalYieldPoint(node, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Node getFinallyAtTarget(Node node) {
        Node next;
        if (node == null) {
            return null;
        }
        if (node.getType() == 138) {
            return node;
        }
        if (node.getType() == 145 && (next = node.getNext()) != null && next.getType() == 138) {
            return next;
        }
        throw Kit.codeBug("bad finally target");
    }

    private static int getLocalBlockRegister(Node node) {
        return ((Node) node.getProp(3)).getExistingIntProp(2);
    }

    private short getNewWordIntern(int i) {
        int i2;
        int[] iArr = this.locals;
        int i3 = this.firstFreeLocal;
        if (i > 1) {
            loop0: while (true) {
                if (i3 + i <= MAX_LOCALS) {
                    i2 = 0;
                    while (i2 < i) {
                        if (iArr[i3 + i2] != 0) {
                            break;
                        }
                        i2++;
                    }
                    break loop0;
                }
                i3 = -1;
                break;
                i3 += i2 + 1;
            }
        }
        if (i3 != -1) {
            iArr[i3] = 1;
            if (i > 1) {
                iArr[i3 + 1] = 1;
            }
            if (i > 2) {
                iArr[i3 + 2] = 1;
            }
            if (i3 == this.firstFreeLocal) {
                for (int i4 = i + i3; i4 < MAX_LOCALS; i4++) {
                    if (iArr[i4] == 0) {
                        short s = (short) i4;
                        this.firstFreeLocal = s;
                        if (this.localsMax < s) {
                            this.localsMax = s;
                        }
                        return (short) i3;
                    }
                }
            } else {
                return (short) i3;
            }
        }
        throw Context.reportRuntimeError("Program too complex (out of locals)");
    }

    private short getNewWordLocal(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        return getNewWordIntern(i);
    }

    private short getNewWordPairLocal(boolean z) {
        int i;
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        return getNewWordIntern(i);
    }

    private int getNextGeneratorState(Node node) {
        return ((FunctionNode) this.scriptOrFn).getResumptionPoints().indexOf(node) + 1;
    }

    private int getTargetLabel(Node node) {
        int labelId = node.labelId();
        if (labelId == -1) {
            int b = this.cfw.b();
            node.labelId(b);
            return b;
        }
        return labelId;
    }

    private void incReferenceWordLocal(int i) {
        int[] iArr = this.locals;
        iArr[i] = iArr[i] + 1;
    }

    private void initBodyGeneration() {
        int paramAndVarCount;
        this.varRegisters = null;
        if (this.scriptOrFn.getType() == 122) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn);
            this.fnCurrent = optFunctionNode;
            boolean requiresActivation = optFunctionNode.fnode.requiresActivation();
            this.hasVarsInRegs = !requiresActivation;
            if (!requiresActivation && (paramAndVarCount = this.fnCurrent.fnode.getParamAndVarCount()) != 0) {
                this.varRegisters = new int[paramAndVarCount];
            }
            boolean isTargetOfDirectCall = this.fnCurrent.isTargetOfDirectCall();
            this.inDirectCallFunction = isTargetOfDirectCall;
            if (isTargetOfDirectCall && !this.hasVarsInRegs) {
                Codegen.badTree();
            }
        } else {
            this.fnCurrent = null;
            this.hasVarsInRegs = false;
            this.inDirectCallFunction = false;
        }
        this.locals = new int[MAX_LOCALS];
        this.funObjLocal = 0;
        this.contextLocal = 1;
        this.variableObjectLocal = 2;
        this.thisObjLocal = 3;
        this.localsMax = 4;
        this.firstFreeLocal = 4;
        this.popvLocal = -1;
        this.argsLocal = -1;
        this.itsZeroArgArray = -1;
        this.itsOneArgArray = -1;
        this.epilogueLabel = -1;
        this.enterAreaStartLabel = -1;
        this.generatorStateLocal = -1;
        this.savedHomeObjectLocal = -1;
    }

    private void inlineFinally(Node node, int i, int i2) {
        Node finallyAtTarget = getFinallyAtTarget(node);
        finallyAtTarget.resetTargets();
        this.exceptionManager.markInlineFinallyStart(finallyAtTarget, i);
        for (Node firstChild = finallyAtTarget.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            generateStatement(firstChild);
        }
        this.exceptionManager.markInlineFinallyEnd(finallyAtTarget, i2);
    }

    private static boolean isArithmeticNode(Node node) {
        int type = node.getType();
        if (type != 22 && type != 25 && type != 24 && type != 23) {
            return false;
        }
        return true;
    }

    private int nodeIsDirectCallParameter(Node node) {
        if (node.getType() == 60 && this.inDirectCallFunction && !this.itsForcedObjectParameters) {
            int varIndex = this.fnCurrent.getVarIndex(node);
            if (this.fnCurrent.isParameter(varIndex)) {
                return this.varRegisters[varIndex];
            }
            return -1;
        }
        return -1;
    }

    private void pushThisFromLastScriptable() {
        this.cfw.g(this.contextLocal);
        addScriptRuntimeInvoke("lastStoredScriptable", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void releaseWordLocal(int i) {
        if (i < this.firstFreeLocal) {
            this.firstFreeLocal = i;
        }
        this.locals[i] = 0;
    }

    private void saveCurrentCodeOffset() {
        this.savedCodeOffset = this.cfw.j;
    }

    private void updateLineNumber(Node node) {
        int lineno = node.getLineno();
        this.itsLineNumber = lineno;
        if (lineno == -1) {
            return;
        }
        this.cfw.n((short) lineno);
    }

    private boolean varIsDirectCallParameter(int i) {
        if (this.fnCurrent.isParameter(i) && this.inDirectCallFunction && !this.itsForcedObjectParameters) {
            return true;
        }
        return false;
    }

    private void visitArithmetic(Node node, int i, Node node2, Node node3) {
        if (node.getIntProp(8, -1) != -1) {
            generateExpression(node2, node);
            generateExpression(node2.getNext(), node);
            switch (i) {
                case 22:
                    this.cfw.c(Token.ASSIGN_BITAND);
                    return;
                case 23:
                    this.cfw.c(Token.ASSIGN_URSH);
                    return;
                case 24:
                    this.cfw.c(Token.ASSIGN_DIV);
                    return;
                case 25:
                    this.cfw.c(Token.HOOK);
                    return;
                default:
                    throw Kit.codeBug(Token.typeToName(i));
            }
        }
        generateExpression(node2, node);
        if (!isArithmeticNode(node2)) {
            addObjectToNumeric();
        }
        generateExpression(node2.getNext(), node);
        if (!isArithmeticNode(node2.getNext())) {
            addObjectToNumeric();
        }
        switch (i) {
            case 22:
                addScriptRuntimeInvoke("subtract", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            case 23:
                addScriptRuntimeInvoke("multiply", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            case 24:
                addScriptRuntimeInvoke("divide", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            case 25:
                addScriptRuntimeInvoke("remainder", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            default:
                throw Kit.codeBug(Token.typeToName(i));
        }
    }

    private void visitArrayLiteral(Node node, Node node2, boolean z) {
        int countArguments = countArguments(node2);
        if (!z && ((countArguments > 10 || this.cfw.j > 30000) && !this.hasVarsInRegs && !this.isGenerator && !this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new ArrayList<>();
            }
            this.literals.add(node);
            String m = a82.m(this.codegen.getBodyMethodName(this.scriptOrFn), "_literal", this.literals.size());
            this.cfw.g(this.funObjLocal);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.g(this.argsLocal);
            this.cfw.m(this.codegen.mainClassName, m, Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        int i = 0;
        if (this.isGenerator) {
            for (int i2 = 0; i2 != countArguments; i2++) {
                generateExpression(node2, node);
                node2 = node2.getNext();
            }
            addNewObjectArray(countArguments);
            while (i != countArguments) {
                this.cfw.c(90);
                this.cfw.c(95);
                this.cfw.r((countArguments - i) - 1);
                this.cfw.c(95);
                this.cfw.c(83);
                i++;
            }
        } else {
            addNewObjectArray(countArguments);
            while (i != countArguments) {
                this.cfw.c(89);
                this.cfw.r(i);
                generateExpression(node2, node);
                this.cfw.c(83);
                node2 = node2.getNext();
                i++;
            }
        }
        int[] iArr = (int[]) node.getProp(11);
        fi1 fi1Var = this.cfw;
        if (iArr == null) {
            fi1Var.c(1);
            this.cfw.c(3);
        } else {
            fi1Var.s(OptRuntime.encodeIntArray(iArr));
            this.cfw.r(iArr.length);
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addOptRuntimeInvoke("newArrayLiteral", "([Ljava/lang/Object;Ljava/lang/String;ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitBitNot(Node node, Node node2) {
        int intProp = node.getIntProp(8, -1);
        generateExpression(node2, node);
        if (intProp == -1) {
            addObjectToNumeric();
            addScriptRuntimeInvoke("bitwiseNOT", "(Ljava/lang/Number;)Ljava/lang/Number;");
            return;
        }
        addScriptRuntimeInvoke("toInt32", "(D)I");
        this.cfw.r(-1);
        this.cfw.c(130);
        this.cfw.c(Token.VAR);
    }

    private void visitBitOp(Node node, int i, Node node2) {
        int intProp = node.getIntProp(8, -1);
        generateExpression(node2, node);
        if (i == 20) {
            addDynamicInvoke("MATH:TOUINT32", Signatures.MATH_TO_UINT32);
            generateExpression(node2.getNext(), node);
            addDynamicInvoke("MATH:TOINT32", Signatures.MATH_TO_INT32);
            this.cfw.r(31);
            this.cfw.c(Token.ELSE);
            this.cfw.c(Token.IF);
            this.cfw.c(Token.FINALLY);
            addDoubleWrap();
        } else if (intProp == -1) {
            addObjectToNumeric();
            generateExpression(node2.getNext(), node);
            addObjectToNumeric();
            if (i != 18) {
                if (i != 19) {
                    switch (i) {
                        case 9:
                            addScriptRuntimeInvoke("bitwiseOR", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                            return;
                        case 10:
                            addScriptRuntimeInvoke("bitwiseXOR", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                            return;
                        case 11:
                            addScriptRuntimeInvoke("bitwiseAND", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                            return;
                        default:
                            throw Kit.codeBug(Token.typeToName(i));
                    }
                }
                addScriptRuntimeInvoke("signedRightShift", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            }
            addScriptRuntimeInvoke("leftShift", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
        } else {
            addScriptRuntimeInvoke("toInt32", "(D)I");
            generateExpression(node2.getNext(), node);
            addScriptRuntimeInvoke("toInt32", "(D)I");
            if (i != 18) {
                if (i != 19) {
                    switch (i) {
                        case 9:
                            this.cfw.c(Token.CASE);
                            break;
                        case 10:
                            this.cfw.c(130);
                            break;
                        case 11:
                            this.cfw.c(Token.ELSE);
                            break;
                        default:
                            throw Kit.codeBug(Token.typeToName(i));
                    }
                } else {
                    this.cfw.c(Token.FUNCTION);
                }
            } else {
                this.cfw.c(120);
            }
            this.cfw.c(Token.VAR);
        }
    }

    private void visitDotQuery(Node node, Node node2) {
        updateLineNumber(node);
        generateExpression(node2, node);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("enterDotQuery", "(Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.h(this.variableObjectLocal);
        this.cfw.c(1);
        int b = this.cfw.b();
        this.cfw.D(b);
        this.cfw.c(87);
        generateExpression(node2.getNext(), node);
        addDynamicInvoke("MATH:TOBOOLEAN", Signatures.MATH_TO_BOOLEAN);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("updateDotQuery", "(ZLorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        this.cfw.c(89);
        this.cfw.d(198, b);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("leaveDotQuery", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.h(this.variableObjectLocal);
    }

    private void visitExponentiation(Node node, Node node2, Node node3) {
        if (node.getIntProp(8, -1) != -1) {
            generateExpression(node2, node);
            generateExpression(node2.getNext(), node);
            this.cfw.m("java/lang/Math", "pow", Token.DOTDOTDOT, "(DD)D");
            return;
        }
        generateExpression(node2, node);
        generateExpression(node2.getNext(), node);
        short newWordLocal = getNewWordLocal();
        this.cfw.h(newWordLocal);
        addObjectToNumeric();
        this.cfw.g(newWordLocal);
        addObjectToNumeric();
        addScriptRuntimeInvoke("exponentiate", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
    }

    private void visitFunction(OptFunctionNode optFunctionNode, int i) {
        int index = this.codegen.getIndex(optFunctionNode.fnode);
        this.cfw.e(Token.LAST_TOKEN, this.codegen.mainClassName);
        this.cfw.c(89);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.contextLocal);
        this.cfw.r(index);
        this.cfw.m(this.codegen.mainClassName, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        if (i == 4) {
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            addOptRuntimeInvoke("bindThis", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Function;");
        }
        if (optFunctionNode.fnode.isMethodDefinition()) {
            this.cfw.c(89);
            this.cfw.g(this.savedHomeObjectLocal);
            this.cfw.m("org/mozilla/javascript/BaseFunction", "setHomeObject", Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Scriptable;)V");
        }
        if (i != 2 && i != 4) {
            this.cfw.r(i);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.contextLocal);
            addOptRuntimeInvoke("initFunction", "(Lorg/mozilla/javascript/NativeFunction;ILorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;)V");
        }
    }

    private void visitGetProp(Node node, Node node2) {
        generateExpression(node2, node);
        if (node.getIntProp(30, 0) == 1) {
            int b = this.cfw.b();
            int b2 = this.cfw.b();
            this.cfw.c(89);
            addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
            this.cfw.d(Token.SETPROP_OP, b);
            this.cfw.c(87);
            this.cfw.f("org/mozilla/javascript/Undefined", "instance", Token.ARROW, "Ljava/lang/Object;");
            this.cfw.d(Token.LET, b2);
            this.cfw.D(b);
            finishGetPropGeneration(node, node2.getNext());
            this.cfw.D(b2);
            return;
        }
        finishGetPropGeneration(node, node2.getNext());
    }

    private void visitGetVar(Node node) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        int i = this.varRegisters[varIndex];
        if (varIsDirectCallParameter(varIndex)) {
            if (node.getIntProp(8, -1) != -1) {
                dcpLoadAsNumber(i);
                return;
            } else {
                dcpLoadAsObject(i);
                return;
            }
        }
        boolean isNumberVar = this.fnCurrent.isNumberVar(varIndex);
        fi1 fi1Var = this.cfw;
        if (isNumberVar) {
            fi1Var.i(i);
        } else {
            fi1Var.g(i);
        }
    }

    private void visitGoto(Jump jump, int i, Node node) {
        Node node2 = jump.target;
        if (i != 6 && i != 7) {
            if (i == 149) {
                if (this.isGenerator) {
                    addGotoWithReturn(node2);
                    return;
                } else {
                    inlineFinally(node2);
                    return;
                }
            }
            addGoto(node2, Token.LET);
        } else if (node != null) {
            int targetLabel = getTargetLabel(node2);
            int b = this.cfw.b();
            if (i == 6) {
                generateIfJump(node, jump, targetLabel, b);
            } else {
                generateIfJump(node, jump, b, targetLabel);
            }
            this.cfw.D(b);
        } else {
            throw Codegen.badTree();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void visitIfJumpEqOp(org.mozilla.javascript.Node r17, org.mozilla.javascript.Node r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.BodyCodegen.visitIfJumpEqOp(org.mozilla.javascript.Node, org.mozilla.javascript.Node, int, int):void");
    }

    private void visitIfJumpRelOp(Node node, Node node2, int i, int i2) {
        String str;
        String str2;
        if (i != -1 && i2 != -1) {
            int type = node.getType();
            Node next = node2.getNext();
            if (type != 58 && type != 57) {
                int intProp = node.getIntProp(8, -1);
                int nodeIsDirectCallParameter = nodeIsDirectCallParameter(node2);
                int nodeIsDirectCallParameter2 = nodeIsDirectCallParameter(next);
                if (intProp != -1) {
                    if (intProp != 2) {
                        generateExpression(node2, node);
                    } else if (nodeIsDirectCallParameter != -1) {
                        dcpLoadAsNumber(nodeIsDirectCallParameter);
                    } else {
                        generateExpression(node2, node);
                        addObjectToDouble();
                    }
                    if (intProp != 1) {
                        generateExpression(next, node);
                    } else if (nodeIsDirectCallParameter2 != -1) {
                        dcpLoadAsNumber(nodeIsDirectCallParameter2);
                    } else {
                        generateExpression(next, node);
                        addObjectToDouble();
                    }
                    genSimpleCompare(type, i, i2);
                    return;
                }
                if (nodeIsDirectCallParameter != -1 && nodeIsDirectCallParameter2 != -1) {
                    fi1 fi1Var = this.cfw;
                    int i3 = fi1Var.m;
                    int b = fi1Var.b();
                    this.cfw.g(nodeIsDirectCallParameter);
                    this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
                    this.cfw.d(Token.SET, b);
                    this.cfw.i(nodeIsDirectCallParameter + 1);
                    dcpLoadAsNumber(nodeIsDirectCallParameter2);
                    genSimpleCompare(type, i, i2);
                    fi1 fi1Var2 = this.cfw;
                    if (i3 == fi1Var2.m) {
                        fi1Var2.D(b);
                        int b2 = this.cfw.b();
                        this.cfw.g(nodeIsDirectCallParameter2);
                        this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
                        this.cfw.d(Token.SET, b2);
                        this.cfw.g(nodeIsDirectCallParameter);
                        addObjectToDouble();
                        this.cfw.i(nodeIsDirectCallParameter2 + 1);
                        genSimpleCompare(type, i, i2);
                        fi1 fi1Var3 = this.cfw;
                        if (i3 == fi1Var3.m) {
                            fi1Var3.D(b2);
                            this.cfw.g(nodeIsDirectCallParameter);
                            this.cfw.g(nodeIsDirectCallParameter2);
                        } else {
                            throw Codegen.badTree();
                        }
                    } else {
                        throw Codegen.badTree();
                    }
                } else {
                    generateExpression(node2, node);
                    generateExpression(next, node);
                }
                switch (type) {
                    case 14:
                        str2 = "MATH:COMPARELT";
                        break;
                    case 15:
                        str2 = "MATH:COMPARELE";
                        break;
                    case 16:
                        str2 = "MATH:COMPAREGT";
                        break;
                    case 17:
                        str2 = "MATH:COMPAREGE";
                        break;
                    default:
                        throw Kit.codeBug();
                }
                addDynamicInvoke(str2, "(Ljava/lang/Object;Ljava/lang/Object;)Z");
                this.cfw.d(Token.SETELEM_OP, i);
                this.cfw.d(Token.LET, i2);
                return;
            }
            generateExpression(node2, node);
            generateExpression(next, node);
            this.cfw.g(this.contextLocal);
            if (type == 58) {
                str = "instanceOf";
            } else {
                str = "in";
            }
            addScriptRuntimeInvoke(str, "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Z");
            this.cfw.d(Token.SETELEM_OP, i);
            this.cfw.d(Token.LET, i2);
            return;
        }
        throw Codegen.badTree();
    }

    private void visitIncDec(Node node) {
        int existingIntProp = node.getExistingIntProp(13);
        Node firstChild = node.getFirstChild();
        boolean z = false;
        if (firstChild.getIntProp(31, 0) == 1) {
            visitSuperIncDec(node, firstChild, existingIntProp);
            return;
        }
        int type = firstChild.getType();
        if (type != 33) {
            if (type != 34) {
                if (type != 39) {
                    if (type != 44) {
                        if (type != 60) {
                            if (type != 73) {
                                Codegen.badTree();
                                return;
                            }
                            generateExpression(firstChild.getFirstChild(), node);
                            this.cfw.g(this.contextLocal);
                            this.cfw.g(this.variableObjectLocal);
                            this.cfw.r(existingIntProp);
                            addScriptRuntimeInvoke("refIncrDecr", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                            return;
                        }
                        if (!this.hasVarsInRegs) {
                            Kit.codeBug();
                        }
                        if ((existingIntProp & 2) != 0) {
                            z = true;
                        }
                        int varIndex = this.fnCurrent.getVarIndex(firstChild);
                        int i = this.varRegisters[varIndex];
                        if (this.fnCurrent.fnode.getParamAndVarConst()[varIndex]) {
                            if (node.getIntProp(8, -1) != -1) {
                                this.cfw.i(i + (varIsDirectCallParameter(varIndex) ? 1 : 0));
                                if (!z) {
                                    this.cfw.q(1.0d);
                                    int i2 = existingIntProp & 1;
                                    fi1 fi1Var = this.cfw;
                                    if (i2 == 0) {
                                        fi1Var.c(99);
                                        return;
                                    } else {
                                        fi1Var.c(Token.ASSIGN_BITAND);
                                        return;
                                    }
                                }
                                return;
                            }
                            if (varIsDirectCallParameter(varIndex)) {
                                dcpLoadAsObject(i);
                            } else {
                                this.cfw.g(i);
                            }
                            if (z) {
                                this.cfw.c(89);
                                addObjectToDouble();
                                this.cfw.c(88);
                                return;
                            }
                            addObjectToDouble();
                            this.cfw.q(1.0d);
                            int i3 = existingIntProp & 1;
                            fi1 fi1Var2 = this.cfw;
                            if (i3 == 0) {
                                fi1Var2.c(99);
                            } else {
                                fi1Var2.c(Token.ASSIGN_BITAND);
                            }
                            addDoubleWrap();
                            return;
                        } else if (node.getIntProp(8, -1) != -1) {
                            boolean varIsDirectCallParameter = varIsDirectCallParameter(varIndex);
                            fi1 fi1Var3 = this.cfw;
                            int i4 = i + (varIsDirectCallParameter ? 1 : 0);
                            fi1Var3.i(i4);
                            if (z) {
                                this.cfw.c(92);
                            }
                            this.cfw.q(1.0d);
                            int i5 = existingIntProp & 1;
                            fi1 fi1Var4 = this.cfw;
                            if (i5 == 0) {
                                fi1Var4.c(99);
                            } else {
                                fi1Var4.c(Token.ASSIGN_BITAND);
                            }
                            if (!z) {
                                this.cfw.c(92);
                            }
                            this.cfw.Q(71, 57, i4);
                            return;
                        } else {
                            if (varIsDirectCallParameter(varIndex)) {
                                dcpLoadAsObject(i);
                            } else {
                                this.cfw.g(i);
                            }
                            addObjectToDouble();
                            if (z) {
                                this.cfw.c(92);
                            }
                            this.cfw.q(1.0d);
                            int i6 = existingIntProp & 1;
                            fi1 fi1Var5 = this.cfw;
                            if (i6 == 0) {
                                fi1Var5.c(99);
                            } else {
                                fi1Var5.c(Token.ASSIGN_BITAND);
                            }
                            addDoubleWrap();
                            if (!z) {
                                this.cfw.c(89);
                            }
                            this.cfw.h(i);
                            if (z) {
                                addDoubleWrap();
                                return;
                            }
                            return;
                        }
                    }
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.s(firstChild.getString());
                    this.cfw.g(this.contextLocal);
                    this.cfw.r(existingIntProp);
                    addScriptRuntimeInvoke("nameIncrDecr", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
                    return;
                }
                Node firstChild2 = firstChild.getFirstChild();
                generateExpression(firstChild2, node);
                generateExpression(firstChild2.getNext(), node);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.r(existingIntProp);
                if (firstChild2.getNext().getIntProp(8, -1) != -1) {
                    addOptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                    return;
                } else {
                    addScriptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                    return;
                }
            }
            throw Kit.codeBug();
        }
        Node firstChild3 = firstChild.getFirstChild();
        generateExpression(firstChild3, node);
        generateExpression(firstChild3.getNext(), node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.r(existingIntProp);
        addScriptRuntimeInvoke("propIncrDecr", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
    }

    private void visitObjectLiteral(Node node, Node node2, boolean z) {
        int length;
        Object[] objArr = (Object[]) node.getProp(12);
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        if (!z && ((length > 10 || this.cfw.j > 30000) && !this.hasVarsInRegs && !this.isGenerator && !this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new ArrayList<>();
            }
            this.literals.add(node);
            String m = a82.m(this.codegen.getBodyMethodName(this.scriptOrFn), "_literal", this.literals.size());
            this.cfw.g(this.funObjLocal);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.g(this.argsLocal);
            this.cfw.m(this.codegen.mainClassName, m, Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.m("org/mozilla/javascript/Context", "newObject", Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.c(89);
        short newWordLocal = getNewWordLocal();
        this.savedHomeObjectLocal = newWordLocal;
        this.cfw.h(newWordLocal);
        this.cfw.c(89);
        addLoadProperty(node, node2, objArr, length);
        Node node3 = node2;
        for (int i = 0; i != length; i++) {
            int type = node3.getType();
            if (type != 165 && type != 166) {
                node3 = node3.getNext();
            } else {
                this.cfw.r(length);
                this.cfw.d(188, 10);
                for (int i2 = 0; i2 != length; i2++) {
                    this.cfw.c(89);
                    this.cfw.r(i2);
                    int type2 = node2.getType();
                    if (type2 == 165) {
                        this.cfw.c(2);
                    } else {
                        fi1 fi1Var = this.cfw;
                        if (type2 == 166) {
                            fi1Var.c(4);
                        } else {
                            fi1Var.c(3);
                        }
                    }
                    this.cfw.c(79);
                    node2 = node2.getNext();
                }
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                addScriptRuntimeInvoke("fillObjectLiteral", "(Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
            }
        }
        this.cfw.c(1);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("fillObjectLiteral", "(Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
    }

    private void visitOptimizedCall(Node node, OptFunctionNode optFunctionNode, int i, Node node2) {
        String bodyMethodName;
        short s = 0;
        if (node.getIntProp(31, 0) == 1) {
            Kit.codeBug();
        }
        Node next = node2.getNext();
        String str = this.codegen.mainClassName;
        if (i == 30) {
            generateExpression(node2, node);
        } else {
            generateFunctionAndThisObj(node2, node);
            pushThisFromLastScriptable();
            s = getNewWordLocal();
            this.cfw.h(s);
        }
        int b = this.cfw.b();
        int b2 = this.cfw.b();
        this.cfw.c(89);
        this.cfw.e(193, str);
        this.cfw.d(Token.SETPROP_OP, b2);
        this.cfw.e(192, str);
        this.cfw.c(89);
        this.cfw.f(str, "_id", 180, "I");
        this.cfw.r(this.codegen.getIndex(optFunctionNode.fnode));
        this.cfw.d(160, b2);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        fi1 fi1Var = this.cfw;
        if (i == 30) {
            fi1Var.c(1);
        } else {
            fi1Var.g(s);
        }
        for (Node node3 = next; node3 != null; node3 = node3.getNext()) {
            int nodeIsDirectCallParameter = nodeIsDirectCallParameter(node3);
            if (nodeIsDirectCallParameter >= 0) {
                this.cfw.g(nodeIsDirectCallParameter);
                this.cfw.i(nodeIsDirectCallParameter + 1);
            } else if (node3.getIntProp(8, -1) == 0) {
                this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
                generateExpression(node3, node);
            } else {
                generateExpression(node3, node);
                this.cfw.q(0.0d);
            }
        }
        this.cfw.f("org/mozilla/javascript/ScriptRuntime", "emptyArgs", Token.ARROW, "[Ljava/lang/Object;");
        fi1 fi1Var2 = this.cfw;
        Codegen codegen = this.codegen;
        String str2 = codegen.mainClassName;
        FunctionNode functionNode = optFunctionNode.fnode;
        if (i == 30) {
            bodyMethodName = codegen.getDirectCtorName(functionNode);
        } else {
            bodyMethodName = codegen.getBodyMethodName(functionNode);
        }
        fi1Var2.m(str2, bodyMethodName, Token.DOTDOTDOT, this.codegen.getBodyMethodSignature(optFunctionNode.fnode));
        this.cfw.d(Token.LET, b);
        this.cfw.D(b2);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (i != 30) {
            this.cfw.g(s);
            releaseWordLocal(s);
        }
        generateCallArgArray(node, next, true);
        if (i == 30) {
            addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        } else {
            this.cfw.m("org/mozilla/javascript/Callable", "call", 185, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        }
        this.cfw.D(b);
    }

    private void visitSetConst(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.g(this.contextLocal);
        addDynamicInvoke("NAME:SETCONST:" + string, Signatures.NAME_SET_CONST);
    }

    private void visitSetConstVar(Node node, Node node2, boolean z) {
        boolean z2;
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        generateExpression(node2.getNext(), node);
        if (node.getIntProp(8, -1) != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.varRegisters[varIndex];
        int b = this.cfw.b();
        int b2 = this.cfw.b();
        fi1 fi1Var = this.cfw;
        if (z2) {
            int i2 = i + 2;
            fi1Var.l(i2);
            this.cfw.d(Token.SETELEM_OP, b2);
            fi1 fi1Var2 = this.cfw;
            int i3 = fi1Var2.m;
            fi1Var2.r(1);
            this.cfw.Q(59, 54, i2);
            this.cfw.Q(71, 57, i);
            fi1 fi1Var3 = this.cfw;
            if (z) {
                fi1Var3.i(i);
                this.cfw.E(b2, i3);
            } else {
                fi1Var3.d(Token.LET, b);
                this.cfw.E(b2, i3);
                this.cfw.c(88);
            }
        } else {
            int i4 = i + 1;
            fi1Var.l(i4);
            this.cfw.d(Token.SETELEM_OP, b2);
            fi1 fi1Var4 = this.cfw;
            int i5 = fi1Var4.m;
            fi1Var4.r(1);
            this.cfw.Q(59, 54, i4);
            this.cfw.h(i);
            fi1 fi1Var5 = this.cfw;
            if (z) {
                fi1Var5.g(i);
                this.cfw.E(b2, i5);
            } else {
                fi1Var5.d(Token.LET, b);
                this.cfw.E(b2, i5);
                this.cfw.c(87);
            }
        }
        this.cfw.D(b);
    }

    private void visitSetElem(int i, Node node, Node node2) {
        boolean z;
        generateExpression(node2, node);
        Node next = node2.getNext();
        if (i == 154) {
            this.cfw.c(89);
        }
        generateExpression(next, node);
        Node next2 = next.getNext();
        boolean z2 = false;
        if (node.getIntProp(8, -1) != -1) {
            z = true;
        } else {
            z = false;
        }
        if (node.getIntProp(31, 0) == 1) {
            z2 = true;
        }
        if (i == 154) {
            if (z2) {
                this.cfw.c(90);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.thisObjLocal);
                addDynamicInvoke("PROP:GETELEMENTSUPER", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
            } else {
                fi1 fi1Var = this.cfw;
                if (z) {
                    fi1Var.c(93);
                    this.cfw.g(this.contextLocal);
                    this.cfw.g(this.variableObjectLocal);
                    addDynamicInvoke("PROP:GETINDEX", Signatures.PROP_GET_INDEX);
                } else {
                    fi1Var.c(90);
                    this.cfw.g(this.contextLocal);
                    this.cfw.g(this.variableObjectLocal);
                    addDynamicInvoke("PROP:GETELEMENT", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
                }
            }
        }
        generateExpression(next2, node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (z2) {
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke("PROP:SETELEMENTSUPER", Signatures.PROP_SET_ELEMENT_SUPER);
        } else if (z) {
            addDynamicInvoke("PROP:SETINDEX", Signatures.PROP_SET_INDEX);
        } else {
            addDynamicInvoke("PROP:SETELEMENT", Signatures.PROP_SET_ELEMENT);
        }
    }

    private void visitSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addDynamicInvoke("NAME:SET:" + string, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
    }

    private void visitSetProp(int i, Node node, Node node2) {
        generateExpression(node2, node);
        Node next = node2.getNext();
        if (i == 153) {
            this.cfw.c(89);
            finishGetPropGeneration(node, next);
        }
        generateExpression(next.getNext(), node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (node.getIntProp(31, 0) == 1) {
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke(s21.m("PROP:SETSUPER:", next.getString()), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
            return;
        }
        addDynamicInvoke(s21.m("PROP:SET:", next.getString()), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
    }

    private void visitSetVar(Node node, Node node2, boolean z) {
        boolean z2;
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        generateExpression(node2.getNext(), node);
        if (node.getIntProp(8, -1) != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.varRegisters[varIndex];
        if (this.fnCurrent.fnode.getParamAndVarConst()[varIndex]) {
            if (!z) {
                fi1 fi1Var = this.cfw;
                if (z2) {
                    fi1Var.c(88);
                } else {
                    fi1Var.c(87);
                }
            }
        } else if (varIsDirectCallParameter(varIndex)) {
            if (z2) {
                if (z) {
                    this.cfw.c(92);
                }
                this.cfw.g(i);
                this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
                int b = this.cfw.b();
                int b2 = this.cfw.b();
                this.cfw.d(Token.GET, b);
                int i2 = this.cfw.m;
                addDoubleWrap();
                this.cfw.h(i);
                this.cfw.d(Token.LET, b2);
                this.cfw.E(b, i2);
                this.cfw.Q(71, 57, i + 1);
                this.cfw.D(b2);
                return;
            }
            if (z) {
                this.cfw.c(89);
            }
            this.cfw.h(i);
        } else {
            boolean isNumberVar = this.fnCurrent.isNumberVar(varIndex);
            if (z2) {
                if (isNumberVar) {
                    this.cfw.Q(71, 57, i);
                    if (z) {
                        this.cfw.i(i);
                        return;
                    }
                    return;
                }
                if (z) {
                    this.cfw.c(92);
                }
                addDoubleWrap();
                this.cfw.h(i);
                return;
            }
            if (isNumberVar) {
                Kit.codeBug();
            }
            this.cfw.h(i);
            if (z) {
                this.cfw.g(i);
            }
        }
    }

    private void visitSpecialCall(Node node, int i, int i2, Node node2) {
        String str;
        String str2;
        this.cfw.g(this.contextLocal);
        if (i == 30) {
            generateExpression(node2, node);
        } else {
            generateFunctionAndThisObj(node2, node);
            pushThisFromLastScriptable();
        }
        boolean z = false;
        generateCallArgArray(node, node2.getNext(), false);
        if (i == 30) {
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.r(i2);
            str = "newObjectSpecial";
            str2 = "(Lorg/mozilla/javascript/Context;Ljava/lang/Object;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;";
        } else {
            if (node.getIntProp(30, 0) == 1) {
                z = true;
            }
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.r(i2);
            String sourceName = this.scriptOrFn.getSourceName();
            fi1 fi1Var = this.cfw;
            if (sourceName == null) {
                sourceName = "";
            }
            fi1Var.s(sourceName);
            this.cfw.r(this.itsLineNumber);
            this.cfw.t(z);
            str = "callSpecial";
            str2 = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;ILjava/lang/String;IZ)Ljava/lang/Object;";
        }
        addOptRuntimeInvoke(str, str2);
    }

    private void visitStandardCall(Node node, Node node2) {
        boolean z;
        String str;
        String str2;
        String str3;
        if (node.getType() == 43) {
            Node next = node2.getNext();
            int type = node2.getType();
            if (node.getIntProp(30, 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            int intProp = node.getIntProp(31, 0);
            String str4 = SIGNATURE_CALL2;
            String str5 = "call2";
            Integer num = null;
            if (intProp == 1) {
                int countArguments = countArguments(next);
                generateFunctionAndThisObj(node2, node);
                this.cfw.g(this.contextLocal);
                this.cfw.m("org/mozilla/javascript/ScriptRuntime", "discardLastStoredScriptable", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;)V");
                this.cfw.g(this.thisObjLocal);
                if (countArguments == 0) {
                    str4 = SIGNATURE_CALL0;
                    str5 = "call0";
                } else if (countArguments == 1) {
                    generateExpression(next, node);
                    str4 = SIGNATURE_CALL1;
                    str5 = "call1";
                } else if (countArguments == 2) {
                    generateExpression(next, node);
                    generateExpression(next.getNext(), node);
                } else {
                    generateCallArgArray(node, next, false);
                    str4 = SIGNATURE_CALLN;
                    str5 = "callN";
                }
            } else if (next == null) {
                if (type == 44) {
                    this.cfw.s(node2.getString());
                    if (z) {
                        str3 = "callName0Optional";
                    } else {
                        str3 = "callName0";
                    }
                    str5 = str3;
                    str4 = "(Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
                } else if (type == 33) {
                    Node firstChild = node2.getFirstChild();
                    generateExpression(firstChild, node);
                    this.cfw.s(firstChild.getNext().getString());
                    if (z) {
                        str2 = "callProp0Optional";
                    } else {
                        str2 = "callProp0";
                    }
                    str5 = str2;
                    str4 = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
                } else if (type != 34) {
                    generateFunctionAndThisObj(node2, node);
                    pushThisFromLastScriptable();
                    if (!z) {
                        str5 = "call0";
                    } else {
                        str5 = "call0Optional";
                    }
                    str4 = SIGNATURE_CALL0;
                } else {
                    throw Kit.codeBug();
                }
            } else {
                boolean z2 = z;
                if (type == 44) {
                    String string = node2.getString();
                    if (z2) {
                        this.cfw.g(this.variableObjectLocal);
                        this.cfw.g(this.contextLocal);
                        addDynamicInvoke("NAME:GETWITHTHISOPTIONAL:" + string, Signatures.NAME_GET_THIS);
                        int b = this.cfw.b();
                        num = Integer.valueOf(b);
                        int b2 = this.cfw.b();
                        this.cfw.c(89);
                        addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                        this.cfw.d(Token.SETPROP_OP, b2);
                        this.cfw.c(87);
                        this.cfw.f("org/mozilla/javascript/Undefined", "instance", Token.ARROW, "Ljava/lang/Object;");
                        this.cfw.d(Token.LET, b);
                        this.cfw.D(b2);
                        pushThisFromLastScriptable();
                        generateCallArgArray(node, next, false);
                        str4 = SIGNATURE_CALLN;
                        str5 = "callN";
                    } else {
                        generateCallArgArray(node, next, false);
                        this.cfw.s(string);
                        str5 = "callName";
                        str4 = "([Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
                    }
                } else {
                    int countArguments2 = countArguments(next);
                    generateFunctionAndThisObj(node2, node);
                    if (z2) {
                        int b3 = this.cfw.b();
                        num = Integer.valueOf(b3);
                        int b4 = this.cfw.b();
                        str = SIGNATURE_CALL2;
                        this.cfw.c(89);
                        addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                        this.cfw.d(Token.SETPROP_OP, b4);
                        this.cfw.c(87);
                        this.cfw.f("org/mozilla/javascript/Undefined", "instance", Token.ARROW, "Ljava/lang/Object;");
                        this.cfw.d(Token.LET, b3);
                        this.cfw.D(b4);
                        this.cfw.e(192, "org/mozilla/javascript/Callable");
                    } else {
                        str = SIGNATURE_CALL2;
                    }
                    pushThisFromLastScriptable();
                    if (countArguments2 == 1) {
                        generateExpression(next, node);
                        str4 = SIGNATURE_CALL1;
                        str5 = "call1";
                    } else if (countArguments2 == 2) {
                        generateExpression(next, node);
                        generateExpression(next.getNext(), node);
                        str4 = str;
                    } else {
                        generateCallArgArray(node, next, false);
                        str4 = SIGNATURE_CALLN;
                        str5 = "callN";
                    }
                }
            }
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            addOptRuntimeInvoke(str5, str4);
            if (num != null) {
                this.cfw.D(num.intValue());
                return;
            }
            return;
        }
        throw Codegen.badTree();
    }

    private void visitStandardNew(Node node, Node node2) {
        if (node.getType() == 30) {
            Node next = node2.getNext();
            generateExpression(node2, node);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            generateCallArgArray(node, next, false);
            addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        throw Codegen.badTree();
    }

    private void visitStrictSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addDynamicInvoke("NAME:SETSTRICT:" + string, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
    }

    private void visitSuperIncDec(Node node, Node node2, int i) {
        Node firstChild = node2.getFirstChild();
        generateExpression(firstChild, node);
        this.cfw.c(89);
        int type = node2.getType();
        if (type != 33) {
            if (type != 39) {
                Codegen.badTree();
            } else {
                generateExpression(firstChild.getNext(), node);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.thisObjLocal);
                addDynamicInvoke("PROP:GETELEMENTSUPER", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
            }
        } else {
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.o(0);
            addDynamicInvoke(s21.m("PROP:GETSUPER:", node2.getFirstChild().getNext().getString()), Signatures.PROP_GET_SUPER);
        }
        int i2 = i & 2;
        if (i2 != 0) {
            this.cfw.c(95);
            this.cfw.c(92);
            this.cfw.c(87);
        }
        addObjectToDouble();
        this.cfw.q(1.0d);
        int i3 = i & 1;
        fi1 fi1Var = this.cfw;
        if (i3 == 0) {
            fi1Var.c(99);
        } else {
            fi1Var.c(Token.ASSIGN_BITAND);
        }
        addDoubleWrap();
        int type2 = node2.getType();
        if (type2 != 33) {
            if (type2 == 39) {
                generateExpression(firstChild.getNext(), node);
                this.cfw.c(95);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.thisObjLocal);
                addDynamicInvoke("PROP:SETELEMENTSUPER", Signatures.PROP_SET_ELEMENT_SUPER);
            }
        } else {
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke(s21.m("PROP:SETSUPER:", node2.getFirstChild().getNext().getString()), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
        }
        if (i2 != 0) {
            this.cfw.c(87);
        }
    }

    private void visitSwitch(Jump jump, Node node) {
        generateExpression(node, jump);
        short newWordLocal = getNewWordLocal();
        this.cfw.h(newWordLocal);
        for (Jump jump2 = (Jump) node.getNext(); jump2 != null; jump2 = (Jump) jump2.getNext()) {
            if (jump2.getType() == 128) {
                generateExpression(jump2.getFirstChild(), jump2);
                this.cfw.g(newWordLocal);
                addDynamicInvoke("MATH:SHALLOWEQ", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
                addGoto(jump2.target, Token.SETELEM_OP);
            } else {
                throw Codegen.badTree();
            }
        }
        releaseWordLocal(newWordLocal);
    }

    private void visitTemplateLiteral(Node node) {
        int existingIntProp = node.getExistingIntProp(27);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        fi1 fi1Var = this.cfw;
        Codegen codegen = this.codegen;
        fi1Var.f(codegen.mainClassName, codegen.getTemplateLiteralName(this.scriptOrFn), Token.ARROW, "[Ljava/lang/Object;");
        this.cfw.r(existingIntProp);
        this.cfw.m("org/mozilla/javascript/ScriptRuntime", "getTemplateLiteralCallSite", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;I)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitTryCatchFinally(Jump jump, Node node) {
        int i;
        BodyCodegen bodyCodegen = this;
        short newWordLocal = bodyCodegen.getNewWordLocal();
        bodyCodegen.cfw.g(bodyCodegen.variableObjectLocal);
        bodyCodegen.cfw.h(newWordLocal);
        int b = bodyCodegen.cfw.b();
        bodyCodegen.cfw.E(b, 0);
        Node node2 = jump.target;
        Node node3 = jump.getFinally();
        int[] iArr = new int[5];
        bodyCodegen.exceptionManager.pushExceptionInfo(jump);
        if (node2 != null) {
            iArr[0] = bodyCodegen.cfw.b();
            iArr[1] = bodyCodegen.cfw.b();
            iArr[2] = bodyCodegen.cfw.b();
            Context currentContext = Context.getCurrentContext();
            if (currentContext != null && currentContext.hasFeature(13)) {
                iArr[3] = bodyCodegen.cfw.b();
            }
        }
        if (node3 != null) {
            iArr[4] = bodyCodegen.cfw.b();
        }
        bodyCodegen.exceptionManager.setHandlers(iArr, b);
        if (bodyCodegen.isGenerator && node3 != null) {
            FinallyReturnPoint finallyReturnPoint = new FinallyReturnPoint();
            if (bodyCodegen.finallys == null) {
                bodyCodegen.finallys = new HashMap();
            }
            bodyCodegen.finallys.put(node3, finallyReturnPoint);
            bodyCodegen.finallys.put(node3.getNext(), finallyReturnPoint);
        }
        for (Node node4 = node; node4 != null; node4 = node4.getNext()) {
            if (node4 == node2) {
                int targetLabel = bodyCodegen.getTargetLabel(node2);
                bodyCodegen.exceptionManager.removeHandler(0, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(1, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(2, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(3, targetLabel);
            }
            bodyCodegen.generateStatement(node4);
        }
        int b2 = bodyCodegen.cfw.b();
        bodyCodegen.cfw.d(Token.LET, b2);
        int localBlockRegister = getLocalBlockRegister(jump);
        if (node2 != null) {
            int labelId = node2.labelId();
            i = localBlockRegister;
            bodyCodegen.generateCatchBlock(0, newWordLocal, labelId, i, iArr[0]);
            generateCatchBlock(1, newWordLocal, labelId, i, iArr[1]);
            generateCatchBlock(2, newWordLocal, labelId, i, iArr[2]);
            Context currentContext2 = Context.getCurrentContext();
            if (currentContext2 != null && currentContext2.hasFeature(13)) {
                bodyCodegen = this;
                bodyCodegen.generateCatchBlock(3, newWordLocal, labelId, i, iArr[3]);
            } else {
                bodyCodegen = this;
            }
        } else {
            i = localBlockRegister;
        }
        if (node3 != null) {
            int b3 = bodyCodegen.cfw.b();
            int b4 = bodyCodegen.cfw.b();
            fi1 fi1Var = bodyCodegen.cfw;
            fi1Var.m = 1;
            fi1Var.D(b3);
            if (!bodyCodegen.isGenerator) {
                bodyCodegen.cfw.D(iArr[4]);
            }
            bodyCodegen.cfw.h(i);
            bodyCodegen.cfw.g(newWordLocal);
            bodyCodegen.cfw.h(bodyCodegen.variableObjectLocal);
            int labelId2 = node3.labelId();
            if (bodyCodegen.isGenerator) {
                bodyCodegen.addGotoWithReturn(node3);
            } else {
                bodyCodegen.inlineFinally(node3, iArr[4], b4);
            }
            bodyCodegen.cfw.g(i);
            if (bodyCodegen.isGenerator) {
                bodyCodegen.cfw.e(192, "java/lang/Throwable");
            }
            bodyCodegen.cfw.c(191);
            bodyCodegen.cfw.D(b4);
            if (bodyCodegen.isGenerator) {
                bodyCodegen.cfw.j(b, null, labelId2, b3);
            }
        }
        bodyCodegen.releaseWordLocal(newWordLocal);
        bodyCodegen.cfw.D(b2);
        if (!bodyCodegen.isGenerator) {
            bodyCodegen.exceptionManager.popExceptionInfo();
        }
    }

    private void visitTypeofname(Node node) {
        int indexForNameNode;
        if (this.hasVarsInRegs && (indexForNameNode = this.fnCurrent.fnode.getIndexForNameNode(node)) >= 0) {
            if (this.fnCurrent.isNumberVar(indexForNameNode)) {
                this.cfw.s("number");
                return;
            } else if (varIsDirectCallParameter(indexForNameNode)) {
                int i = this.varRegisters[indexForNameNode];
                this.cfw.g(i);
                this.cfw.f("java/lang/Void", "TYPE", Token.ARROW, "Ljava/lang/Class;");
                int b = this.cfw.b();
                this.cfw.d(Token.GET, b);
                fi1 fi1Var = this.cfw;
                int i2 = fi1Var.m;
                fi1Var.g(i);
                addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
                int b2 = this.cfw.b();
                this.cfw.d(Token.LET, b2);
                this.cfw.E(b, i2);
                this.cfw.s("number");
                this.cfw.D(b2);
                return;
            } else {
                this.cfw.g(this.varRegisters[indexForNameNode]);
                addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
                return;
            }
        }
        this.cfw.g(this.variableObjectLocal);
        this.cfw.s(node.getString());
        addScriptRuntimeInvoke("typeofName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/String;");
    }

    public void generateBodyCode() {
        this.isGenerator = Codegen.isGenerator(this.scriptOrFn);
        initBodyGeneration();
        if (this.isGenerator) {
            String n = hl5.n("(", this.codegen.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;");
            fi1 fi1Var = this.cfw;
            String bodyMethodName = this.codegen.getBodyMethodName(this.scriptOrFn);
            fi1Var.N(bodyMethodName + "_gen", n, (short) 10);
        } else {
            this.cfw.N(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short) 10);
        }
        generatePrologue();
        OptFunctionNode optFunctionNode = this.fnCurrent;
        Node node = this.scriptOrFn;
        if (optFunctionNode != null) {
            node = node.getLastChild();
        }
        generateStatement(node);
        generateEpilogue();
        this.cfw.O((short) (this.localsMax + 1));
        if (this.isGenerator) {
            generateGenerator();
        }
        if (this.literals != null) {
            for (int i = 0; i < this.literals.size(); i++) {
                Node node2 = this.literals.get(i);
                int type = node2.getType();
                if (type != 71) {
                    if (type != 72) {
                        Kit.codeBug(Token.typeToName(type));
                    } else {
                        generateObjectLiteralFactory(node2, i + 1);
                    }
                } else {
                    generateArrayLiteralFactory(node2, i + 1);
                }
            }
        }
    }

    private short getNewWordLocal() {
        return getNewWordIntern(1);
    }

    private void addInstructionCount() {
        addInstructionCount(Math.max(this.cfw.j - this.savedCodeOffset, 1));
    }

    private void inlineFinally(Node node) {
        int b = this.cfw.b();
        int b2 = this.cfw.b();
        this.cfw.D(b);
        inlineFinally(node, b, b2);
        this.cfw.D(b2);
    }
}
