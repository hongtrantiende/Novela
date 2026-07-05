package org.mozilla.javascript.optimizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.TemplateCharacters;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Codegen implements Evaluator {
    static final String DEFAULT_MAIN_METHOD_CLASS = "org.mozilla.javascript.optimizer.OptRuntime";
    static final String FUNCTION_CONSTRUCTOR_SIGNATURE = "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V";
    static final String FUNCTION_INIT_SIGNATURE = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V";
    static final String ID_FIELD_NAME = "_id";
    static final String REGEXP_INIT_METHOD_NAME = "_reInit";
    static final String REGEXP_INIT_METHOD_SIGNATURE = "(Lorg/mozilla/javascript/Context;)V";
    private static final String SUPER_CLASS_NAME = "org.mozilla.javascript.NativeFunction";
    static final String TEMPLATE_LITERAL_INIT_METHOD_NAME = "_qInit";
    static final String TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE = "()V";
    private static final Object globalLock = new Object();
    private static int globalSerialClassCounter;
    private CompilerEnvirons compilerEnv;
    private List<OptFunctionNode> directCallTargets;
    private double[] itsConstantList;
    private int itsConstantListSize;
    String mainClassName;
    String mainClassSignature;
    private String mainMethodClass = DEFAULT_MAIN_METHOD_CLASS;
    private HashMap<ScriptNode, Integer> scriptOrFnIndexes;
    ScriptNode[] scriptOrFnNodes;

    private static void addDoubleWrap(fi1 fi1Var) {
        fi1Var.m("org/mozilla/javascript/optimizer/OptRuntime", "wrapDouble", Token.DOTDOTDOT, "(D)Ljava/lang/Double;");
    }

    public static RuntimeException badTree() {
        throw new RuntimeException("Bad tree in codegen");
    }

    private static void collectScriptNodes_r(ScriptNode scriptNode, List<ScriptNode> list) {
        list.add(scriptNode);
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            collectScriptNodes_r(scriptNode.getFunctionNode(i), list);
        }
    }

    private Class<?> defineClass(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        String str = (String) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        GeneratedClassLoader createLoader = SecurityController.createLoader(getClass().getClassLoader(), obj2);
        try {
            Class<?> defineClass = createLoader.defineClass(str, bArr);
            createLoader.linkClass(defineClass);
            return defineClass;
        } catch (IllegalArgumentException | SecurityException e) {
            cy7.e("Malformed optimizer package ".concat(String.valueOf(e)));
            return null;
        }
    }

    private void emitConstantDudeInitializers(fi1 fi1Var) {
        int i = this.itsConstantListSize;
        if (i == 0) {
            return;
        }
        fi1Var.N("<clinit>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 24);
        double[] dArr = this.itsConstantList;
        for (int i2 = 0; i2 != i; i2++) {
            double d = dArr[i2];
            String j = a82.j(i2, "_k");
            String staticConstantWrapperType = getStaticConstantWrapperType(d);
            fi1Var.k(j, staticConstantWrapperType, (short) 10);
            int i3 = (int) d;
            if (i3 == d) {
                fi1Var.r(i3);
                fi1Var.m("java/lang/Integer", "valueOf", Token.DOTDOTDOT, "(I)Ljava/lang/Integer;");
            } else {
                fi1Var.q(d);
                addDoubleWrap(fi1Var);
            }
            fi1Var.f(this.mainClassName, j, Token.YIELD_STAR, staticConstantWrapperType);
        }
        fi1Var.c(Token.METHOD);
        fi1Var.O(0);
    }

    private void emitDirectConstructor(fi1 fi1Var, OptFunctionNode optFunctionNode) {
        fi1Var.N(getDirectCtorName(optFunctionNode.fnode), getBodyMethodSignature(optFunctionNode.fnode), (short) 10);
        int paramCount = optFunctionNode.fnode.getParamCount();
        int i = paramCount * 3;
        int i2 = i + 4;
        int i3 = i + 5;
        fi1Var.g(0);
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.m("org/mozilla/javascript/BaseFunction", "createObject", Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        fi1Var.h(i3);
        fi1Var.g(0);
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.g(i3);
        for (int i4 = 0; i4 < paramCount; i4++) {
            int i5 = i4 * 3;
            fi1Var.g(i5 + 4);
            fi1Var.i(i5 + 5);
        }
        fi1Var.g(i2);
        fi1Var.m(this.mainClassName, getBodyMethodName(optFunctionNode.fnode), Token.DOTDOTDOT, getBodyMethodSignature(optFunctionNode.fnode));
        int b = fi1Var.b();
        fi1Var.c(89);
        fi1Var.e(193, "org/mozilla/javascript/Scriptable");
        fi1Var.d(Token.SETPROP_OP, b);
        fi1Var.e(192, "org/mozilla/javascript/Scriptable");
        fi1Var.c(Token.GENEXPR);
        fi1Var.D(b);
        fi1Var.g(i3);
        fi1Var.c(Token.GENEXPR);
        fi1Var.O((short) (i + 6));
    }

    private void emitRegExpInit(fi1 fi1Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i2 == scriptNodeArr.length) {
                break;
            }
            i3 += scriptNodeArr[i2].getRegexpCount();
            i2++;
        }
        if (i3 == 0) {
            return;
        }
        short s = 10;
        fi1Var.N(REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE, (short) 10);
        fi1Var.k("_reInitDone", "Z", (short) 74);
        fi1Var.f(this.mainClassName, "_reInitDone", Token.ARROW, "Z");
        int b = fi1Var.b();
        fi1Var.d(Token.SETPROP_OP, b);
        fi1Var.c(Token.METHOD);
        fi1Var.D(b);
        fi1Var.g(0);
        fi1Var.m("org/mozilla/javascript/ScriptRuntime", "checkRegExpProxy", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        fi1Var.h(1);
        int i4 = 0;
        while (true) {
            ScriptNode[] scriptNodeArr2 = this.scriptOrFnNodes;
            if (i4 != scriptNodeArr2.length) {
                ScriptNode scriptNode = scriptNodeArr2[i4];
                int regexpCount = scriptNode.getRegexpCount();
                int i5 = i;
                while (i5 != regexpCount) {
                    String compiledRegexpName = getCompiledRegexpName(scriptNode, i5);
                    String regexpString = scriptNode.getRegexpString(i5);
                    String regexpFlags = scriptNode.getRegexpFlags(i5);
                    fi1Var.k(compiledRegexpName, "Ljava/lang/Object;", s);
                    fi1Var.g(1);
                    fi1Var.g(i);
                    fi1Var.s(regexpString);
                    if (regexpFlags == null) {
                        fi1Var.c(1);
                    } else {
                        fi1Var.s(regexpFlags);
                    }
                    fi1Var.m("org/mozilla/javascript/RegExpProxy", "compileRegExp", 185, "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
                    fi1Var.f(this.mainClassName, compiledRegexpName, Token.YIELD_STAR, "Ljava/lang/Object;");
                    i5++;
                    i = 0;
                    s = 10;
                }
                i4++;
                i = 0;
                s = 10;
            } else {
                fi1Var.r(1);
                fi1Var.f(this.mainClassName, "_reInitDone", Token.YIELD_STAR, "Z");
                fi1Var.c(Token.METHOD);
                fi1Var.O(2);
                return;
            }
        }
    }

    private void emitTemplateLiteralInit(fi1 fi1Var) {
        int i = 0;
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            i += scriptNode.getTemplateLiteralCount();
        }
        if (i == 0) {
            return;
        }
        short s = 10;
        fi1Var.N(TEMPLATE_LITERAL_INIT_METHOD_NAME, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 10);
        fi1Var.k("_qInitDone", "Z", (short) 74);
        fi1Var.f(this.mainClassName, "_qInitDone", Token.ARROW, "Z");
        int b = fi1Var.b();
        fi1Var.d(Token.SETPROP_OP, b);
        fi1Var.c(Token.METHOD);
        fi1Var.D(b);
        ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
        int length = scriptNodeArr.length;
        int i2 = 0;
        while (i2 < length) {
            ScriptNode scriptNode2 = scriptNodeArr[i2];
            int templateLiteralCount = scriptNode2.getTemplateLiteralCount();
            if (templateLiteralCount != 0) {
                String templateLiteralName = getTemplateLiteralName(scriptNode2);
                fi1Var.k(templateLiteralName, "[Ljava/lang/Object;", s);
                fi1Var.r(templateLiteralCount);
                int i3 = 189;
                fi1Var.e(189, "java/lang/Object");
                int i4 = 0;
                while (i4 < templateLiteralCount) {
                    List<TemplateCharacters> templateLiteralStrings = scriptNode2.getTemplateLiteralStrings(i4);
                    int i5 = 89;
                    fi1Var.c(89);
                    fi1Var.r(i4);
                    fi1Var.r(templateLiteralStrings.size() * 2);
                    fi1Var.e(i3, "java/lang/String");
                    int i6 = 0;
                    for (TemplateCharacters templateCharacters : templateLiteralStrings) {
                        fi1Var.c(i5);
                        int i7 = i6 + 1;
                        fi1Var.r(i6);
                        if (templateCharacters.getValue() != null) {
                            fi1Var.s(templateCharacters.getValue());
                        } else {
                            fi1Var.c(1);
                        }
                        fi1Var.c(83);
                        fi1Var.c(89);
                        i6 += 2;
                        fi1Var.r(i7);
                        fi1Var.s(templateCharacters.getRawValue());
                        fi1Var.c(83);
                        i5 = 89;
                    }
                    fi1Var.c(83);
                    i4++;
                    i3 = 189;
                }
                fi1Var.f(this.mainClassName, templateLiteralName, Token.YIELD_STAR, "[Ljava/lang/Object;");
            }
            i2++;
            s = 10;
        }
        fi1Var.t(true);
        fi1Var.f(this.mainClassName, "_qInitDone", Token.YIELD_STAR, "Z");
        fi1Var.c(Token.METHOD);
        fi1Var.O(0);
    }

    private void generateCallMethod(fi1 fi1Var, boolean z) {
        boolean z2;
        int i;
        int paramCount;
        fi1Var.N("call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        int b = fi1Var.b();
        fi1Var.g(1);
        fi1Var.m("org/mozilla/javascript/ScriptRuntime", "hasTopCall", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;)Z");
        fi1Var.d(Token.SETELEM_OP, b);
        int i2 = 0;
        fi1Var.g(0);
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.g(3);
        fi1Var.g(4);
        fi1Var.t(z);
        fi1Var.m("org/mozilla/javascript/ScriptRuntime", "doTopCall", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Z)Ljava/lang/Object;");
        fi1Var.c(Token.GENEXPR);
        fi1Var.D(b);
        fi1Var.g(0);
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.g(3);
        fi1Var.g(4);
        int length = this.scriptOrFnNodes.length;
        if (2 <= length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            fi1Var.p();
            fi1Var.f(fi1Var.d, ID_FIELD_NAME, 180, "I");
            i = fi1Var.w(1, length - 1);
        } else {
            i = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 != length) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i3];
            if (z2) {
                if (i3 == 0) {
                    fi1Var.H(i);
                    i4 = fi1Var.m;
                } else {
                    fi1Var.G(i, i3 - 1, i4);
                }
            }
            if (scriptNode.getType() == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                if (optFunctionNode.isTargetOfDirectCall() && (paramCount = optFunctionNode.fnode.getParamCount()) != 0) {
                    for (int i5 = i2; i5 != paramCount; i5++) {
                        fi1Var.c(190);
                        fi1Var.r(i5);
                        int b2 = fi1Var.b();
                        int b3 = fi1Var.b();
                        fi1Var.d(Token.TO_DOUBLE, b2);
                        fi1Var.g(4);
                        fi1Var.r(i5);
                        fi1Var.c(50);
                        fi1Var.d(Token.LET, b3);
                        fi1Var.D(b2);
                        pushUndefined(fi1Var);
                        fi1Var.D(b3);
                        fi1Var.z();
                        fi1Var.q(0.0d);
                        fi1Var.g(4);
                    }
                }
            }
            fi1Var.m(this.mainClassName, getBodyMethodName(scriptNode), Token.DOTDOTDOT, getBodyMethodSignature(scriptNode));
            fi1Var.c(Token.GENEXPR);
            i3++;
            i2 = 0;
        }
        fi1Var.O(5);
    }

    private byte[] generateCode(String str) {
        boolean z;
        boolean z2 = true;
        if (this.scriptOrFnNodes[0].getType() == 150) {
            z = true;
        } else {
            z = false;
        }
        ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
        if (scriptNodeArr.length <= 1 && z) {
            z2 = false;
        }
        boolean isInStrictMode = scriptNodeArr[0].isInStrictMode();
        fi1 fi1Var = new fi1(this.mainClassName, SUPER_CLASS_NAME, this.scriptOrFnNodes[0].getSourceName());
        fi1Var.k(ID_FIELD_NAME, "I", (short) 2);
        if (z2) {
            generateFunctionConstructor(fi1Var);
        }
        if (z) {
            fi1Var.r.add(Short.valueOf(fi1Var.k.a("org/mozilla/javascript/Script")));
            generateScriptCtor(fi1Var);
            generateMain(fi1Var);
            generateExecute(fi1Var);
        }
        generateCallMethod(fi1Var, isInStrictMode);
        generateResumeGenerator(fi1Var);
        generateNativeFunctionOverrides(fi1Var, str);
        int length = this.scriptOrFnNodes.length;
        for (int i = 0; i != length; i++) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i];
            BodyCodegen bodyCodegen = new BodyCodegen();
            bodyCodegen.cfw = fi1Var;
            bodyCodegen.codegen = this;
            bodyCodegen.compilerEnv = this.compilerEnv;
            bodyCodegen.scriptOrFn = scriptNode;
            bodyCodegen.scriptOrFnIndex = i;
            bodyCodegen.generateBodyCode();
            if (scriptNode.getType() == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                generateFunctionInit(fi1Var, optFunctionNode);
                if (optFunctionNode.isTargetOfDirectCall()) {
                    emitDirectConstructor(fi1Var, optFunctionNode);
                }
            }
        }
        emitRegExpInit(fi1Var);
        emitTemplateLiteralInit(fi1Var);
        emitConstantDudeInitializers(fi1Var);
        return fi1Var.P();
    }

    private static void generateExecute(fi1 fi1Var) {
        fi1Var.N("exec", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;", (short) 17);
        fi1Var.p();
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.c(89);
        fi1Var.c(1);
        fi1Var.m(fi1Var.d, "call", Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        fi1Var.g(1);
        fi1Var.m("org.mozilla.javascript.Context", "processMicrotasks", Token.TEMPLATE_LITERAL_SUBST, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        fi1Var.c(Token.GENEXPR);
        fi1Var.O(3);
    }

    private void generateFunctionConstructor(fi1 fi1Var) {
        int i;
        int i2;
        boolean z = true;
        fi1Var.N("<init>", FUNCTION_CONSTRUCTOR_SIGNATURE, (short) 1);
        int i3 = 0;
        fi1Var.g(0);
        fi1Var.m(SUPER_CLASS_NAME, "<init>", Token.TAGGED_TEMPLATE_LITERAL, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        fi1Var.p();
        fi1Var.l(3);
        fi1Var.f(fi1Var.d, ID_FIELD_NAME, Token.TEMPLATE_CHARS, "I");
        fi1Var.p();
        fi1Var.g(2);
        fi1Var.g(1);
        if (this.scriptOrFnNodes[0].getType() == 150) {
            i = 1;
        } else {
            i = 0;
        }
        int length = this.scriptOrFnNodes.length;
        if (i != length) {
            if (2 > length - i) {
                z = false;
            }
            if (z) {
                fi1Var.l(3);
                i2 = fi1Var.w(i + 1, length - 1);
            } else {
                i2 = 0;
            }
            for (int i4 = i; i4 != length; i4++) {
                if (z) {
                    if (i4 == i) {
                        fi1Var.H(i2);
                        i3 = fi1Var.m;
                    } else {
                        fi1Var.G(i2, (i4 - 1) - i, i3);
                    }
                }
                fi1Var.m(this.mainClassName, getFunctionInitMethodName(OptFunctionNode.get(this.scriptOrFnNodes[i4])), Token.TAGGED_TEMPLATE_LITERAL, FUNCTION_INIT_SIGNATURE);
                fi1Var.c(Token.METHOD);
            }
            fi1Var.O(4);
            return;
        }
        throw badTree();
    }

    private void generateFunctionInit(fi1 fi1Var, OptFunctionNode optFunctionNode) {
        fi1Var.N(getFunctionInitMethodName(optFunctionNode), FUNCTION_INIT_SIGNATURE, (short) 18);
        fi1Var.p();
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.m("org/mozilla/javascript/NativeFunction", "initScriptFunction", Token.TEMPLATE_LITERAL_SUBST, FUNCTION_INIT_SIGNATURE);
        if (optFunctionNode.fnode.getRegexpCount() != 0) {
            fi1Var.g(1);
            fi1Var.m(this.mainClassName, REGEXP_INIT_METHOD_NAME, Token.DOTDOTDOT, REGEXP_INIT_METHOD_SIGNATURE);
        }
        if (optFunctionNode.fnode.getTemplateLiteralCount() != 0) {
            fi1Var.m(this.mainClassName, TEMPLATE_LITERAL_INIT_METHOD_NAME, Token.DOTDOTDOT, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        }
        fi1Var.c(Token.METHOD);
        fi1Var.O(3);
    }

    private void generateMain(fi1 fi1Var) {
        fi1Var.N("main", "([Ljava/lang/String;)V", (short) 9);
        String str = fi1Var.d;
        fi1Var.e(Token.LAST_TOKEN, str);
        fi1Var.c(89);
        fi1Var.m(str, "<init>", Token.TAGGED_TEMPLATE_LITERAL, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        fi1Var.c(42);
        fi1Var.m(this.mainMethodClass, "main", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V");
        fi1Var.c(Token.METHOD);
        fi1Var.O(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void generateNativeFunctionOverrides(fi1 fi1Var, String str) {
        short s;
        int i;
        short s2;
        short s3;
        short s4;
        boolean z;
        short s5 = 1;
        fi1Var.N("getLanguageVersion", "()I", (short) 1);
        fi1Var.r(this.compilerEnv.getLanguageVersion());
        int i2 = Token.LETEXPR;
        fi1Var.c(Token.LETEXPR);
        fi1Var.O(1);
        int i3 = 0;
        while (i3 != 9) {
            if (i3 == 4 && str == null) {
                s2 = s5;
            } else {
                int i4 = 3;
                switch (i3) {
                    case 0:
                        fi1Var.N("getFunctionName", "()Ljava/lang/String;", s5);
                        s = s5;
                        break;
                    case 1:
                        fi1Var.N("getParamCount", "()I", s5);
                        s = s5;
                        break;
                    case 2:
                        fi1Var.N("getParamAndVarCount", "()I", s5);
                        s = s5;
                        break;
                    case 3:
                        fi1Var.N("getParamOrVarName", "(I)Ljava/lang/String;", s5);
                        s = 2;
                        break;
                    case 4:
                        fi1Var.N("getRawSource", "()Ljava/lang/String;", s5);
                        fi1Var.s(str);
                        s = s5;
                        break;
                    case 5:
                        fi1Var.N("getParamOrVarConst", "(I)Z", s5);
                        s = 3;
                        break;
                    case 6:
                        fi1Var.N("isGeneratorFunction", "()Z", (short) 4);
                        s = s5;
                        break;
                    case 7:
                        fi1Var.N("hasRestParameter", "()Z", s5);
                        s = s5;
                        break;
                    case 8:
                        fi1Var.N("hasDefaultParameters", "()Z", s5);
                        s = s5;
                        break;
                    default:
                        throw Kit.codeBug();
                }
                int length = this.scriptOrFnNodes.length;
                if (length > s5) {
                    fi1Var.p();
                    fi1Var.f(fi1Var.d, ID_FIELD_NAME, 180, "I");
                    i = fi1Var.w(s5, length - 1);
                } else {
                    i = 0;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 != length) {
                    ScriptNode scriptNode = this.scriptOrFnNodes[i5];
                    if (i5 == 0) {
                        if (length > s5) {
                            fi1Var.H(i);
                            i6 = fi1Var.m;
                        }
                    } else {
                        fi1Var.G(i, i5 - 1, i6);
                    }
                    switch (i3) {
                        case 0:
                            s3 = s5;
                            if (scriptNode.getType() == 150) {
                                fi1Var.s("");
                            } else {
                                fi1Var.s(((FunctionNode) scriptNode).getName());
                            }
                            fi1Var.c(Token.GENEXPR);
                            break;
                        case 1:
                            if (scriptNode.hasRestParameter()) {
                                s3 = 1;
                                fi1Var.r(scriptNode.getParamCount() - 1);
                            } else {
                                s3 = 1;
                                fi1Var.r(scriptNode.getParamCount());
                            }
                            fi1Var.c(i2);
                            break;
                        case 2:
                            fi1Var.r(scriptNode.getParamAndVarCount());
                            i2 = Token.LETEXPR;
                            fi1Var.c(Token.LETEXPR);
                            s3 = 1;
                            break;
                        case 3:
                            int paramAndVarCount = scriptNode.getParamAndVarCount();
                            if (paramAndVarCount == 0) {
                                s4 = 1;
                                fi1Var.c(1);
                                fi1Var.c(Token.GENEXPR);
                            } else {
                                s4 = 1;
                                if (paramAndVarCount == 1) {
                                    fi1Var.s(scriptNode.getParamOrVarName(0));
                                    fi1Var.c(Token.GENEXPR);
                                } else {
                                    fi1Var.l(1);
                                    int w = fi1Var.w(1, paramAndVarCount - 1);
                                    int i7 = 0;
                                    while (i7 != paramAndVarCount) {
                                        if (fi1Var.m != 0) {
                                            Kit.codeBug();
                                        }
                                        String paramOrVarName = scriptNode.getParamOrVarName(i7);
                                        if (i7 == 0) {
                                            fi1Var.H(w);
                                        } else {
                                            fi1Var.G(w, i7 - 1, 0);
                                        }
                                        fi1Var.s(paramOrVarName);
                                        fi1Var.c(Token.GENEXPR);
                                        i7++;
                                        i2 = Token.LETEXPR;
                                    }
                                    s3 = 1;
                                    break;
                                }
                            }
                            s3 = s4;
                            break;
                        case 4:
                            fi1Var.r(scriptNode.getRawSourceStart());
                            fi1Var.r(scriptNode.getRawSourceEnd());
                            fi1Var.m("java/lang/String", "substring", Token.TEMPLATE_LITERAL_SUBST, "(II)Ljava/lang/String;");
                            fi1Var.c(Token.GENEXPR);
                            s3 = 1;
                            break;
                        case 5:
                            int paramAndVarCount2 = scriptNode.getParamAndVarCount();
                            boolean[] paramAndVarConst = scriptNode.getParamAndVarConst();
                            if (paramAndVarCount2 == 0) {
                                fi1Var.c(i4);
                                fi1Var.c(i2);
                            } else if (paramAndVarCount2 == s5) {
                                fi1Var.t(paramAndVarConst[0]);
                                fi1Var.c(i2);
                            } else {
                                fi1Var.l(s5);
                                int w2 = fi1Var.w(s5, paramAndVarCount2 - 1);
                                int i8 = 0;
                                while (i8 != paramAndVarCount2) {
                                    if (fi1Var.m != 0) {
                                        Kit.codeBug();
                                    }
                                    if (i8 == 0) {
                                        fi1Var.H(w2);
                                    } else {
                                        fi1Var.G(w2, i8 - 1, 0);
                                    }
                                    fi1Var.t(paramAndVarConst[i8]);
                                    fi1Var.c(i2);
                                    i8++;
                                    s5 = 1;
                                }
                            }
                            s3 = s5;
                            break;
                        case 6:
                            if (scriptNode instanceof FunctionNode) {
                                fi1Var.t(((FunctionNode) scriptNode).isES6Generator());
                            } else {
                                fi1Var.c(i4);
                            }
                            fi1Var.c(i2);
                            s3 = s5;
                            break;
                        case 7:
                            fi1Var.t(scriptNode.hasRestParameter());
                            fi1Var.c(i2);
                            s3 = s5;
                            break;
                        case 8:
                            if (scriptNode instanceof FunctionNode) {
                                if (scriptNode.getDefaultParams() != null) {
                                    z = s5;
                                } else {
                                    z = false;
                                }
                                fi1Var.t(z);
                            } else {
                                fi1Var.c(i4);
                            }
                            fi1Var.c(i2);
                            s3 = s5;
                            break;
                        default:
                            throw Kit.codeBug();
                    }
                    i5++;
                    s5 = s3;
                    i4 = 3;
                }
                s2 = s5;
                fi1Var.O(s);
            }
            i3++;
            s5 = s2;
        }
    }

    private void generateResumeGenerator(fi1 fi1Var) {
        int i = 0;
        boolean z = false;
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            if (isGenerator(scriptNode)) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        fi1Var.N("resumeGenerator", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        fi1Var.g(0);
        fi1Var.g(1);
        fi1Var.g(2);
        fi1Var.g(4);
        fi1Var.g(5);
        fi1Var.l(3);
        fi1Var.p();
        fi1Var.f(fi1Var.d, ID_FIELD_NAME, 180, "I");
        int w = fi1Var.w(0, this.scriptOrFnNodes.length - 1);
        fi1Var.H(w);
        int b = fi1Var.b();
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i < scriptNodeArr.length) {
                ScriptNode scriptNode2 = scriptNodeArr[i];
                fi1Var.G(w, i, 6);
                if (isGenerator(scriptNode2)) {
                    fi1Var.m(this.mainClassName, nk2.u(getBodyMethodName(scriptNode2), "_gen"), Token.DOTDOTDOT, hl5.n("(", this.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;"));
                    fi1Var.c(Token.GENEXPR);
                } else {
                    fi1Var.d(Token.LET, b);
                }
                i++;
            } else {
                fi1Var.D(b);
                pushUndefined(fi1Var);
                fi1Var.c(Token.GENEXPR);
                fi1Var.O(6);
                return;
            }
        }
    }

    private static void generateScriptCtor(fi1 fi1Var) {
        fi1Var.N("<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 1);
        fi1Var.p();
        fi1Var.m(SUPER_CLASS_NAME, "<init>", Token.TAGGED_TEMPLATE_LITERAL, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        fi1Var.p();
        fi1Var.r(0);
        fi1Var.f(fi1Var.d, ID_FIELD_NAME, Token.TEMPLATE_CHARS, "I");
        fi1Var.c(Token.METHOD);
        fi1Var.O(1);
    }

    private static String getStaticConstantWrapperType(double d) {
        if (((int) d) == d) {
            return "Ljava/lang/Integer;";
        }
        return "Ljava/lang/Double;";
    }

    private static void initOptFunctions_r(ScriptNode scriptNode) {
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            FunctionNode functionNode = scriptNode.getFunctionNode(i);
            new OptFunctionNode(functionNode);
            initOptFunctions_r(functionNode);
        }
    }

    private void initScriptNodesData(ScriptNode scriptNode) {
        ArrayList arrayList = new ArrayList();
        collectScriptNodes_r(scriptNode, arrayList);
        int size = arrayList.size();
        ScriptNode[] scriptNodeArr = new ScriptNode[size];
        this.scriptOrFnNodes = scriptNodeArr;
        arrayList.toArray(scriptNodeArr);
        this.scriptOrFnIndexes = new HashMap<>();
        for (int i = 0; i != size; i++) {
            this.scriptOrFnIndexes.put(this.scriptOrFnNodes[i], Integer.valueOf(i));
        }
    }

    public static boolean isGenerator(ScriptNode scriptNode) {
        if (scriptNode.getType() == 122 && ((FunctionNode) scriptNode).isGenerator()) {
            return true;
        }
        return false;
    }

    public static void pushUndefined(fi1 fi1Var) {
        fi1Var.f("org/mozilla/javascript/Undefined", "instance", Token.ARROW, "Ljava/lang/Object;");
    }

    private void transform(ScriptNode scriptNode) {
        initOptFunctions_r(scriptNode);
        boolean isInterpretedMode = this.compilerEnv.isInterpretedMode();
        HashMap hashMap = null;
        if (!isInterpretedMode && scriptNode.getType() == 150) {
            int functionCount = scriptNode.getFunctionCount();
            for (int i = 0; i != functionCount; i++) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode, i);
                if (optFunctionNode.fnode.getFunctionType() == 1) {
                    String name = optFunctionNode.fnode.getName();
                    if (name.length() != 0) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(name, optFunctionNode);
                    }
                }
            }
        }
        if (hashMap != null) {
            this.directCallTargets = new ArrayList();
        }
        new OptTransformer(hashMap, this.directCallTargets).transform(scriptNode, this.compilerEnv);
        if (!isInterpretedMode) {
            new Optimizer().optimize(scriptNode);
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public void captureStackInfo(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    public String cleanName(ScriptNode scriptNode) {
        if (scriptNode instanceof FunctionNode) {
            Name functionName = ((FunctionNode) scriptNode).getFunctionName();
            if (functionName == null) {
                return "anonymous";
            }
            return functionName.getIdentifier();
        }
        return "script";
    }

    @Override // org.mozilla.javascript.Evaluator
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z) {
        int i;
        synchronized (globalLock) {
            i = globalSerialClassCounter + 1;
            globalSerialClassCounter = i;
        }
        String str2 = "c";
        if (scriptNode.getSourceName().length() > 0) {
            str2 = scriptNode.getSourceName().replaceAll("\\W", "_");
            if (!Character.isJavaIdentifierStart(str2.charAt(0))) {
                str2 = "_".concat(str2);
            }
        }
        String str3 = "org.mozilla.javascript.gen." + str2 + "_" + i;
        return new Object[]{str3, compileToClassFile(compilerEnvirons, str3, scriptNode, str, z)};
    }

    public byte[] compileToClassFile(CompilerEnvirons compilerEnvirons, String str, ScriptNode scriptNode, String str2, boolean z) {
        this.compilerEnv = compilerEnvirons;
        transform(scriptNode);
        if (z) {
            scriptNode = scriptNode.getFunctionNode(0);
        }
        initScriptNodesData(scriptNode);
        this.mainClassName = str;
        int i = fi1.E;
        int length = str.length();
        int i2 = length + 1;
        int i3 = length + 2;
        char[] cArr = new char[i3];
        cArr[0] = 'L';
        cArr[i2] = ';';
        str.getChars(0, length, cArr, 1);
        for (int i4 = 1; i4 != i2; i4++) {
            if (cArr[i4] == '.') {
                cArr[i4] = '/';
            }
        }
        this.mainClassSignature = new String(cArr, 0, i3);
        return generateCode(str2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2) {
        try {
            return (NativeFunction) defineClass(obj, obj2).getConstructors()[0].newInstance(scriptable, context, 0);
        } catch (Exception e) {
            cy7.e(s21.m("Unable to instantiate compiled class:", e.toString()));
            return null;
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public Script createScriptObject(Object obj, Object obj2) {
        try {
            return (Script) defineClass(obj, obj2).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            cy7.e(s21.m("Unable to instantiate compiled class:", e.toString()));
            return null;
        }
    }

    public String getBodyMethodName(ScriptNode scriptNode) {
        String cleanName = cleanName(scriptNode);
        int index = getIndex(scriptNode);
        return "_c_" + cleanName + "_" + index;
    }

    public String getBodyMethodSignature(ScriptNode scriptNode) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.mainClassSignature);
        sb.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;");
        if (scriptNode.getType() == 122) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
            if (optFunctionNode.isTargetOfDirectCall()) {
                int paramCount = optFunctionNode.fnode.getParamCount();
                for (int i = 0; i != paramCount; i++) {
                    sb.append("Ljava/lang/Object;D");
                }
            }
        }
        sb.append("[Ljava/lang/Object;)Ljava/lang/Object;");
        return sb.toString();
    }

    public String getCompiledRegexpName(ScriptNode scriptNode, int i) {
        return rs8.k("_re", getIndex(scriptNode), i, "_");
    }

    public String getDirectCtorName(ScriptNode scriptNode) {
        return a82.j(getIndex(scriptNode), "_n");
    }

    public String getFunctionInitMethodName(OptFunctionNode optFunctionNode) {
        return a82.j(getIndex(optFunctionNode.fnode), "_i");
    }

    public int getIndex(ScriptNode scriptNode) {
        return this.scriptOrFnIndexes.get(scriptNode).intValue();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getPatchedStack(RhinoException rhinoException, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public List<String> getScriptStack(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getSourcePositionFromStack(Context context, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public String getTemplateLiteralName(ScriptNode scriptNode) {
        return a82.j(getIndex(scriptNode), "_q");
    }

    public void pushNumberAsObject(fi1 fi1Var, double d) {
        if (d == 0.0d) {
            if (1.0d / d > 0.0d) {
                fi1Var.f("org/mozilla/javascript/ScriptRuntime", "zeroObj", Token.ARROW, "Ljava/lang/Integer;");
                return;
            }
            fi1Var.q(d);
            addDoubleWrap(fi1Var);
        } else if (d == 1.0d) {
            fi1Var.f("org/mozilla/javascript/optimizer/OptRuntime", "oneObj", Token.ARROW, "Ljava/lang/Integer;");
        } else if (d == -1.0d) {
            fi1Var.f("org/mozilla/javascript/optimizer/OptRuntime", "minusOneObj", Token.ARROW, "Ljava/lang/Integer;");
        } else if (Double.isNaN(d)) {
            fi1Var.f("org/mozilla/javascript/ScriptRuntime", "NaNobj", Token.ARROW, "Ljava/lang/Double;");
        } else {
            int i = this.itsConstantListSize;
            if (i >= 2000) {
                fi1Var.q(d);
                addDoubleWrap(fi1Var);
                return;
            }
            int i2 = 0;
            if (i == 0) {
                this.itsConstantList = new double[64];
            } else {
                double[] dArr = this.itsConstantList;
                int i3 = 0;
                while (i3 != i && dArr[i3] != d) {
                    i3++;
                }
                if (i == dArr.length) {
                    double[] dArr2 = new double[i * 2];
                    System.arraycopy(this.itsConstantList, 0, dArr2, 0, i);
                    this.itsConstantList = dArr2;
                }
                i2 = i3;
            }
            if (i2 == i) {
                this.itsConstantList[i] = d;
                this.itsConstantListSize = i + 1;
            }
            fi1Var.f(this.mainClassName, a82.j(i2, "_k"), Token.ARROW, getStaticConstantWrapperType(d));
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public void setEvalScriptFlag(Script script) {
        throw new UnsupportedOperationException();
    }

    public void setMainMethodClass(String str) {
        this.mainMethodClass = str;
    }
}
