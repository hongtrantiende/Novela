package org.mozilla.javascript;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.mozilla.javascript.ES6Generator;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.debug.DebugFrame;
import org.mozilla.javascript.debug.Debugger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Interpreter extends Icode implements Evaluator {
    private static final int EXCEPTION_COST = 100;
    static final int EXCEPTION_HANDLER_SLOT = 2;
    static final int EXCEPTION_LOCAL_SLOT = 4;
    static final int EXCEPTION_SCOPE_SLOT = 5;
    static final int EXCEPTION_SLOT_SIZE = 6;
    static final int EXCEPTION_TRY_END_SLOT = 1;
    static final int EXCEPTION_TRY_START_SLOT = 0;
    static final int EXCEPTION_TYPE_SLOT = 3;
    private static final int INVOCATION_COST = 100;
    private static final Object undefined = Undefined.instance;
    InterpreterData itsData;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class ContinuationJump implements Serializable {
        private static final long serialVersionUID = 7687739156004308247L;
        CallFrame branchFrame;
        CallFrame capturedFrame;
        Object result;
        double resultDbl;

        public ContinuationJump(NativeContinuation nativeContinuation, CallFrame callFrame) {
            CallFrame callFrame2 = (CallFrame) nativeContinuation.getImplementation();
            this.capturedFrame = callFrame2;
            if (callFrame2 != null && callFrame != null) {
                int i = callFrame2.frameIndex - callFrame.frameIndex;
                if (i != 0) {
                    if (i < 0) {
                        i = -i;
                    } else {
                        callFrame = callFrame2;
                        callFrame2 = callFrame;
                    }
                    do {
                        callFrame = callFrame.parentFrame;
                        i--;
                    } while (i != 0);
                    if (callFrame.frameIndex != callFrame2.frameIndex) {
                        Kit.codeBug();
                    }
                    callFrame = callFrame2;
                    callFrame2 = callFrame;
                }
                while (!Objects.equals(callFrame2, callFrame) && callFrame2 != null) {
                    callFrame2 = callFrame2.parentFrame;
                    callFrame = callFrame.parentFrame;
                }
                this.branchFrame = callFrame2;
                if (callFrame2 != null && !callFrame2.frozen) {
                    Kit.codeBug();
                    return;
                }
                return;
            }
            this.branchFrame = null;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class GeneratorState {
        int operation;
        RuntimeException returnedException;
        Object value;

        public GeneratorState(int i, Object obj) {
            this.operation = i;
            this.value = obj;
        }
    }

    private static void addInstructionCount(Context context, CallFrame callFrame, int i) {
        int i2 = (callFrame.pc - callFrame.pcPrevBranch) + i + context.instructionCount;
        context.instructionCount = i2;
        if (i2 > context.instructionThreshold) {
            context.observeInstructionCount(i2);
            context.instructionCount = 0;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
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
    private static int bytecodeSpan(int r4) {
        /*
            r0 = -84
            r1 = 3
            if (r4 == r0) goto L5f
            r0 = -83
            if (r4 == r0) goto L5f
            r0 = -73
            if (r4 == r0) goto L5f
            r0 = -72
            if (r4 == r0) goto L5f
            r0 = -61
            if (r4 == r0) goto L5f
            r0 = -28
            if (r4 == r0) goto L5f
            r0 = 55
            if (r4 == r0) goto L5f
            r0 = 62
            r2 = 2
            if (r4 == r0) goto L5e
            r0 = 78
            if (r4 == r0) goto L5f
            r0 = -26
            r3 = 5
            if (r4 == r0) goto L5d
            r0 = -25
            if (r4 == r0) goto L5d
            if (r4 == r3) goto L5f
            r0 = 6
            if (r4 == r0) goto L5f
            r0 = 7
            if (r4 == r0) goto L5f
            switch(r4) {
                case -70: goto L5f;
                case -69: goto L5f;
                case -68: goto L5c;
                default: goto L3a;
            }
        L3a:
            switch(r4) {
                case -56: goto L5c;
                case -55: goto L5c;
                case -54: goto L5b;
                case -53: goto L5a;
                case -52: goto L59;
                default: goto L3d;
            }
        L3d:
            switch(r4) {
                case -47: goto L58;
                case -46: goto L57;
                case -45: goto L56;
                default: goto L40;
            }
        L40:
            switch(r4) {
                case -34: goto L56;
                case -33: goto L55;
                case -32: goto L54;
                case -31: goto L54;
                default: goto L43;
            }
        L43:
            switch(r4) {
                case -11: goto L53;
                case -10: goto L53;
                case -9: goto L53;
                case -8: goto L53;
                case -7: goto L53;
                case -6: goto L5f;
                default: goto L46;
            }
        L46:
            boolean r4 = org.mozilla.javascript.Icode.validBytecode(r4)
            if (r4 == 0) goto L4e
            r4 = 1
            return r4
        L4e:
            java.lang.RuntimeException r4 = org.mozilla.javascript.Kit.codeBug()
            throw r4
        L53:
            return r2
        L54:
            return r1
        L55:
            return r3
        L56:
            return r2
        L57:
            return r1
        L58:
            return r3
        L59:
            return r2
        L5a:
            return r1
        L5b:
            return r3
        L5c:
            return r2
        L5d:
            return r3
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Interpreter.bytecodeSpan(int):int");
    }

    private static NativeContinuation captureContinuation(Context context, CallFrame callFrame, boolean z) {
        Object[] objArr;
        NativeContinuation nativeContinuation = new NativeContinuation();
        ScriptRuntime.setObjectProtoAndParent(nativeContinuation, ScriptRuntime.getTopCallScope(context));
        CallFrame callFrame2 = callFrame;
        CallFrame callFrame3 = callFrame2;
        while (callFrame2 != null && !callFrame2.frozen) {
            callFrame2.frozen = true;
            int i = callFrame2.savedStackTop + 1;
            while (true) {
                objArr = callFrame2.stack;
                if (i == objArr.length) {
                    break;
                }
                objArr[i] = null;
                callFrame2.stackAttributes[i] = 0;
                i++;
            }
            int i2 = callFrame2.savedCallOp;
            if (i2 != 43 && i2 != -85) {
                if (i2 != 30) {
                    Kit.codeBug();
                }
            } else {
                objArr[callFrame2.savedStackTop] = null;
            }
            callFrame3 = callFrame2;
            callFrame2 = callFrame2.parentFrame;
        }
        if (z) {
            while (true) {
                CallFrame callFrame4 = callFrame3.parentFrame;
                if (callFrame4 == null) {
                    break;
                }
                callFrame3 = callFrame4;
            }
            if (!callFrame3.isContinuationsTopFrame) {
                vs.k("Cannot capture continuation from JavaScript code not called directly by executeScriptWithContinuations or callFunctionWithContinuations");
                return null;
            }
        }
        nativeContinuation.initImplementation(callFrame);
        return nativeContinuation;
    }

    private static CallFrame captureFrameForGenerator(CallFrame callFrame) {
        callFrame.frozen = true;
        CallFrame cloneFrozen = callFrame.cloneFrozen();
        callFrame.frozen = false;
        cloneFrozen.parentFrame = null;
        cloneFrozen.frameIndex = 0;
        return cloneFrozen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean compareIdata(InterpreterData interpreterData, InterpreterData interpreterData2) {
        if (interpreterData != interpreterData2 && !Objects.equals(getRawSource(interpreterData), getRawSource(interpreterData2))) {
            return false;
        }
        return true;
    }

    private static void doAdd(Object[] objArr, double[] dArr, int i, Context context) {
        Number numeric;
        Number numeric2;
        boolean z;
        double d;
        Number numeric3;
        int i2 = i + 1;
        Object obj = objArr[i2];
        Object obj2 = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            d = dArr[i2];
            if (obj2 == uniqueTag) {
                dArr[i] = dArr[i] + d;
                return;
            }
            z = true;
        } else if (obj2 == uniqueTag) {
            obj2 = obj;
            z = false;
            d = dArr[i];
        } else if (!(obj2 instanceof Scriptable) && !(obj instanceof Scriptable)) {
            if (obj2 instanceof CharSequence) {
                if (obj instanceof CharSequence) {
                    objArr[i] = new ConsString((CharSequence) obj2, (CharSequence) obj);
                    return;
                } else {
                    objArr[i] = new ConsString((CharSequence) obj2, ScriptRuntime.toCharSequence(obj));
                    return;
                }
            } else if (obj instanceof CharSequence) {
                objArr[i] = new ConsString(ScriptRuntime.toCharSequence(obj2), (CharSequence) obj);
                return;
            } else {
                if (obj2 instanceof Number) {
                    numeric = (Number) obj2;
                } else {
                    numeric = ScriptRuntime.toNumeric(obj2);
                }
                if (obj instanceof Number) {
                    numeric2 = (Number) obj;
                } else {
                    numeric2 = ScriptRuntime.toNumeric(obj);
                }
                boolean z2 = numeric instanceof BigInteger;
                if (z2 && (numeric2 instanceof BigInteger)) {
                    objArr[i] = ((BigInteger) numeric).add((BigInteger) numeric2);
                    return;
                } else if (!z2 && !(numeric2 instanceof BigInteger)) {
                    objArr[i] = uniqueTag;
                    dArr[i] = numeric2.doubleValue() + numeric.doubleValue();
                    return;
                } else {
                    throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
                }
            }
        } else {
            objArr[i] = ScriptRuntime.add(obj2, obj, context);
            return;
        }
        if (obj2 instanceof Scriptable) {
            Object wrapNumber = ScriptRuntime.wrapNumber(d);
            if (!z) {
                Object obj3 = obj2;
                obj2 = wrapNumber;
                wrapNumber = obj3;
            }
            objArr[i] = ScriptRuntime.add(obj2, wrapNumber, context);
        } else if (obj2 instanceof CharSequence) {
            String numberToString = ScriptRuntime.numberToString(d, 10);
            if (z) {
                objArr[i] = new ConsString((CharSequence) obj2, numberToString);
            } else {
                objArr[i] = new ConsString(numberToString, (CharSequence) obj2);
            }
        } else {
            if (obj2 instanceof Number) {
                numeric3 = (Number) obj2;
            } else {
                numeric3 = ScriptRuntime.toNumeric(obj2);
            }
            if (!(numeric3 instanceof BigInteger)) {
                objArr[i] = uniqueTag;
                dArr[i] = numeric3.doubleValue() + d;
                return;
            }
            throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
        }
    }

    private static int doArithmetic(CallFrame callFrame, int i, Object[] objArr, double[] dArr, int i2) {
        Number exponentiate;
        Number stack_numeric = stack_numeric(callFrame, i2 - 1);
        Number stack_numeric2 = stack_numeric(callFrame, i2);
        int i3 = i2 - 1;
        if (i != 81) {
            switch (i) {
                case 22:
                    exponentiate = ScriptRuntime.subtract(stack_numeric, stack_numeric2);
                    break;
                case 23:
                    exponentiate = ScriptRuntime.multiply(stack_numeric, stack_numeric2);
                    break;
                case 24:
                    exponentiate = ScriptRuntime.divide(stack_numeric, stack_numeric2);
                    break;
                case 25:
                    exponentiate = ScriptRuntime.remainder(stack_numeric, stack_numeric2);
                    break;
                default:
                    exponentiate = null;
                    break;
            }
        } else {
            exponentiate = ScriptRuntime.exponentiate(stack_numeric, stack_numeric2);
        }
        if (exponentiate instanceof BigInteger) {
            objArr[i3] = exponentiate;
            return i3;
        }
        objArr[i3] = UniqueTag.DOUBLE_MARK;
        dArr[i3] = exponentiate.doubleValue();
        return i3;
    }

    private static int doBitNOT(CallFrame callFrame, Object[] objArr, double[] dArr, int i) {
        Number bitwiseNOT = ScriptRuntime.bitwiseNOT(stack_numeric(callFrame, i));
        if (bitwiseNOT instanceof BigInteger) {
            objArr[i] = bitwiseNOT;
            return i;
        }
        objArr[i] = UniqueTag.DOUBLE_MARK;
        dArr[i] = bitwiseNOT.doubleValue();
        return i;
    }

    private static int doBitOp(CallFrame callFrame, int i, Object[] objArr, double[] dArr, int i2) {
        Number leftShift;
        Number stack_numeric = stack_numeric(callFrame, i2 - 1);
        Number stack_numeric2 = stack_numeric(callFrame, i2);
        int i3 = i2 - 1;
        if (i != 18) {
            if (i != 19) {
                switch (i) {
                    case 9:
                        leftShift = ScriptRuntime.bitwiseOR(stack_numeric, stack_numeric2);
                        break;
                    case 10:
                        leftShift = ScriptRuntime.bitwiseXOR(stack_numeric, stack_numeric2);
                        break;
                    case 11:
                        leftShift = ScriptRuntime.bitwiseAND(stack_numeric, stack_numeric2);
                        break;
                    default:
                        leftShift = null;
                        break;
                }
            } else {
                leftShift = ScriptRuntime.signedRightShift(stack_numeric, stack_numeric2);
            }
        } else {
            leftShift = ScriptRuntime.leftShift(stack_numeric, stack_numeric2);
        }
        if (leftShift instanceof BigInteger) {
            objArr[i3] = leftShift;
            return i3;
        }
        objArr[i3] = UniqueTag.DOUBLE_MARK;
        dArr[i3] = leftShift.doubleValue();
        return i3;
    }

    private static final NewState doCallByteCode(Context context, CallFrame callFrame, boolean z, int i, int i2, int i3) {
        Scriptable scriptable;
        CallFrame callFrame2;
        CallFrame callFrame3;
        Object[] applyArguments;
        CallFrame callFrame4 = callFrame;
        Object[] objArr = callFrame4.stack;
        double[] dArr = callFrame4.sDbl;
        if (z) {
            context.instructionCount += 100;
        }
        int i4 = i2 - (i3 + 1);
        Callable callable = (Callable) objArr[i4];
        Scriptable scriptable2 = (Scriptable) objArr[i4 + 1];
        if (callable instanceof BaseFunction) {
            scriptable = ((BaseFunction) callable).getHomeObject();
        } else {
            scriptable = null;
        }
        if (i == -85) {
            scriptable2 = callFrame4.thisObj;
        }
        if (i == 76) {
            objArr[i4] = ScriptRuntime.callRef(callable, scriptable2, getArgsArray(objArr, dArr, i4 + 2, i3), context);
            return new ContinueLoop(callFrame4, i4, i3, 0);
        }
        Scriptable scriptable3 = callFrame4.scope;
        if (callFrame4.useActivation) {
            scriptable3 = ScriptableObject.getTopLevelScope(scriptable3);
        }
        int i5 = i3;
        Object[] objArr2 = objArr;
        double[] dArr2 = dArr;
        Callable callable2 = callable;
        while (true) {
            if (callable2 instanceof ArrowFunction) {
                ArrowFunction arrowFunction = (ArrowFunction) callable2;
                Callable targetFunction = arrowFunction.getTargetFunction();
                Scriptable callThis = arrowFunction.getCallThis(context);
                scriptable = arrowFunction.getBoundHomeObject();
                callable2 = targetFunction;
                scriptable2 = callThis;
            } else if (callable2 instanceof LambdaConstructor) {
                break;
            } else if (callable2 instanceof LambdaFunction) {
                callable2 = ((LambdaFunction) callable2).getTarget();
            } else if (callable2 instanceof BoundFunction) {
                BoundFunction boundFunction = (BoundFunction) callable2;
                Callable targetFunction2 = boundFunction.getTargetFunction();
                Scriptable callThis2 = boundFunction.getCallThis(context, scriptable3);
                Object[] boundArgs = boundFunction.getBoundArgs();
                int length = boundArgs.length;
                if (length > 0) {
                    objArr2 = callFrame4.ensureStackLength(length + i4 + 2 + i5);
                    dArr2 = callFrame4.sDbl;
                    int i6 = i4 + 2;
                    int i7 = i6 + length;
                    System.arraycopy(objArr2, i6, objArr2, i7, i5);
                    System.arraycopy(dArr2, i6, dArr2, i7, i5);
                    System.arraycopy(boundArgs, 0, objArr2, i6, length);
                    i5 += length;
                }
                callable2 = targetFunction2;
                scriptable2 = callThis2;
            } else {
                if (callable2 instanceof IdFunctionObject) {
                    IdFunctionObject idFunctionObject = (IdFunctionObject) callable2;
                    if (!BaseFunction.isApplyOrCall(idFunctionObject)) {
                        break;
                    }
                    Callable callable3 = ScriptRuntime.getCallable(scriptable2);
                    int i8 = i4 + 2;
                    Scriptable applyThis = getApplyThis(context, objArr2, dArr2, i8, i5, callable3, callFrame4);
                    callFrame2 = callFrame4;
                    if (BaseFunction.isApply(idFunctionObject)) {
                        if (i5 < 2) {
                            applyArguments = ScriptRuntime.emptyArgs;
                        } else {
                            applyArguments = ScriptRuntime.getApplyArguments(context, objArr2[i4 + 3]);
                        }
                        int length2 = applyArguments.length;
                        Object[] ensureStackLength = callFrame2.ensureStackLength(length2 + i4 + 2);
                        double[] dArr3 = callFrame2.sDbl;
                        System.arraycopy(applyArguments, 0, ensureStackLength, i8, length2);
                        objArr2 = ensureStackLength;
                        i5 = length2;
                        dArr2 = dArr3;
                    } else if (i5 > 0) {
                        if (i5 > 1) {
                            int i9 = i4 + 3;
                            int i10 = i5 - 1;
                            System.arraycopy(objArr2, i9, objArr2, i8, i10);
                            System.arraycopy(dArr2, i9, dArr2, i8, i10);
                        }
                        i5--;
                    }
                    callable2 = callable3;
                    scriptable2 = applyThis;
                } else {
                    callFrame2 = callFrame4;
                    if (callable2 instanceof ScriptRuntime.NoSuchMethodShim) {
                        ScriptRuntime.NoSuchMethodShim noSuchMethodShim = (ScriptRuntime.NoSuchMethodShim) callable2;
                        objArr2 = callFrame2.ensureStackLength(i4 + 4);
                        dArr2 = callFrame2.sDbl;
                        int i11 = i4 + 2;
                        Object[] argsArray = getArgsArray(objArr2, dArr2, i11, i5);
                        Callable callable4 = noSuchMethodShim.noSuchMethodMethod;
                        objArr2[i11] = noSuchMethodShim.methodName;
                        objArr2[i4 + 3] = context.newArray(scriptable3, argsArray);
                        callable2 = callable4;
                        i5 = 2;
                    } else if (callable2 == null) {
                        throw ScriptRuntime.notFunctionError(null, null);
                    }
                }
                callFrame4 = callFrame2;
            }
        }
        callFrame2 = callFrame4;
        if (callable2 instanceof InterpretedFunction) {
            InterpretedFunction interpretedFunction = (InterpretedFunction) callable2;
            if (callFrame2.fnOrScript.securityDomain == interpretedFunction.securityDomain) {
                if (i == -62) {
                    callFrame3 = callFrame2.parentFrame;
                    exitFrame(context, callFrame2, null);
                } else {
                    callFrame3 = callFrame2;
                }
                Scriptable scriptable4 = scriptable;
                int i12 = i5;
                Scriptable scriptable5 = scriptable2;
                CallFrame initFrame = initFrame(context, scriptable3, scriptable5, scriptable4, objArr2, dArr2, i4 + 2, i12, interpretedFunction, callFrame3);
                if (i != -62) {
                    callFrame2.savedStackTop = i4;
                    callFrame2.savedCallOp = i;
                }
                return new StateContinue(initFrame, 0);
            }
        }
        double[] dArr4 = dArr2;
        Scriptable scriptable6 = scriptable2;
        Object[] objArr3 = objArr2;
        Scriptable scriptable7 = scriptable3;
        if (callable2 instanceof NativeContinuation) {
            ContinuationJump continuationJump = new ContinuationJump((NativeContinuation) callable2, callFrame2);
            if (i5 == 0) {
                continuationJump.result = undefined;
            } else {
                int i13 = i4 + 2;
                continuationJump.result = objArr3[i13];
                continuationJump.resultDbl = dArr4[i13];
            }
            return new NewThrowable(continuationJump, 0);
        } else if ((callable2 instanceof IdFunctionObject) && NativeContinuation.isContinuationConstructor((IdFunctionObject) callable2)) {
            callFrame2.stack[i4] = captureContinuation(context, callFrame2.parentFrame, false);
            return new ContinueLoop(callFrame2, i4, i5, 0);
        } else {
            context.lastInterpreterFrame = callFrame2;
            callFrame2.savedCallOp = i;
            callFrame2.savedStackTop = i4;
            objArr3[i4] = callable2.call(context, scriptable7, scriptable6, getArgsArray(objArr3, dArr4, i4 + 2, i5));
            return new ContinueLoop(callFrame2, i4, i5, 0);
        }
    }

    private static int doCallSpecial(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        int i3;
        int i4 = callFrame.pc;
        int i5 = bArr[i4] & 255;
        if (bArr[i4 + 1] != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int index = getIndex(bArr, i4 + 2);
        if (z2) {
            i3 = i - i2;
            Object obj = objArr[i3];
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(dArr[i3]);
            }
            objArr[i3] = ScriptRuntime.newSpecial(context, obj, getArgsArray(objArr, dArr, i3 + 1, i2), callFrame.scope, i5);
        } else {
            i3 = i - (i2 + 1);
            objArr[i3] = ScriptRuntime.callSpecial(context, (Callable) objArr[i3], (Scriptable) objArr[i3 + 1], getArgsArray(objArr, dArr, i3 + 2, i2), callFrame.scope, callFrame.thisObj, i5, callFrame.idata.itsSourceFile, index, z);
        }
        callFrame.pc += 4;
        return i3;
    }

    private static int doCompare(CallFrame callFrame, int i, Object[] objArr, double[] dArr, int i2) {
        boolean compare;
        Number numeric;
        Number valueOf;
        int i3 = i2 - 1;
        Object obj = objArr[i2];
        Object obj2 = objArr[i3];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            numeric = Double.valueOf(dArr[i2]);
            valueOf = stack_numeric(callFrame, i3);
        } else if (obj2 == uniqueTag) {
            numeric = ScriptRuntime.toNumeric(obj);
            valueOf = Double.valueOf(dArr[i3]);
        } else {
            compare = ScriptRuntime.compare(obj2, obj, i);
            objArr[i3] = ScriptRuntime.wrapBoolean(compare);
            return i3;
        }
        compare = ScriptRuntime.compare(valueOf, numeric, i);
        objArr[i3] = ScriptRuntime.wrapBoolean(compare);
        return i3;
    }

    private static int doDelName(Context context, CallFrame callFrame, int i, Object[] objArr, double[] dArr, int i2) {
        boolean z;
        Object obj = objArr[i2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i2]);
        }
        int i3 = i2 - 1;
        Object obj2 = objArr[i3];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i3]);
        }
        Scriptable scriptable = callFrame.scope;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        objArr[i3] = ScriptRuntime.delete(obj2, obj, context, scriptable, z);
        return i3;
    }

    private static int doElemIncDec(Context context, CallFrame callFrame, byte[] bArr, Object[] objArr, double[] dArr, int i) {
        Object obj = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        int i2 = i - 1;
        Object obj2 = objArr[i2];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i2]);
        }
        objArr[i2] = ScriptRuntime.elemIncrDecr(obj2, obj, context, callFrame.scope, bArr[callFrame.pc]);
        callFrame.pc++;
        return i2;
    }

    private static boolean doEquals(Object[] objArr, double[] dArr, int i) {
        int i2 = i + 1;
        Object obj = objArr[i2];
        Object obj2 = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            if (obj2 == uniqueTag) {
                if (dArr[i] == dArr[i2]) {
                    return true;
                }
                return false;
            }
            return ScriptRuntime.eqNumber(dArr[i2], obj2);
        } else if (obj2 == uniqueTag) {
            return ScriptRuntime.eqNumber(dArr[i], obj);
        } else {
            return ScriptRuntime.eq(obj2, obj);
        }
    }

    private static int doGetElem(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i) {
        Object objectIndex;
        int i2 = i - 1;
        Object obj = objArr[i2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i2]);
        }
        Object obj2 = objArr[i];
        if (obj2 != uniqueTag) {
            objectIndex = ScriptRuntime.getObjectElem(obj, obj2, context, callFrame.scope);
        } else {
            objectIndex = ScriptRuntime.getObjectIndex(obj, dArr[i], context, callFrame.scope);
        }
        objArr[i2] = objectIndex;
        return i2;
    }

    private static int doGetElemSuper(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i) {
        Object superIndex;
        int i2 = i - 1;
        Object obj = objArr[i2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            Kit.codeBug();
        }
        Object obj2 = objArr[i];
        if (obj2 != uniqueTag) {
            superIndex = ScriptRuntime.getSuperElem(obj, obj2, context, callFrame.scope, callFrame.thisObj);
        } else {
            superIndex = ScriptRuntime.getSuperIndex(obj, dArr[i], context, callFrame.scope, callFrame.thisObj);
        }
        objArr[i2] = superIndex;
        return i2;
    }

    private static int doGetVar(CallFrame callFrame, Object[] objArr, double[] dArr, int i, Object[] objArr2, double[] dArr2, int i2) {
        int i3 = i + 1;
        if (!callFrame.useActivation) {
            objArr[i3] = objArr2[i2];
            dArr[i3] = dArr2[i2];
            return i3;
        }
        String str = callFrame.idata.argNames[i2];
        Scriptable scriptable = callFrame.scope;
        objArr[i3] = scriptable.get(str, scriptable);
        return i3;
    }

    private static int doInOrInstanceof(Context context, int i, Object[] objArr, double[] dArr, int i2) {
        boolean instanceOf;
        Object obj = objArr[i2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i2]);
        }
        int i3 = i2 - 1;
        Object obj2 = objArr[i3];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i3]);
        }
        if (i == 57) {
            instanceOf = ScriptRuntime.in(obj2, obj, context);
        } else {
            instanceOf = ScriptRuntime.instanceOf(obj2, obj, context);
        }
        objArr[i3] = ScriptRuntime.wrapBoolean(instanceOf);
        return i3;
    }

    private static int doRefMember(Context context, Object[] objArr, double[] dArr, int i, int i2) {
        Object obj = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        int i3 = i - 1;
        Object obj2 = objArr[i3];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i3]);
        }
        objArr[i3] = ScriptRuntime.memberRef(obj2, obj, context, i2);
        return i3;
    }

    private static int doRefNsMember(Context context, Object[] objArr, double[] dArr, int i, int i2) {
        Object obj = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        int i3 = i - 1;
        Object obj2 = objArr[i3];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i3]);
        }
        int i4 = i - 2;
        Object obj3 = objArr[i4];
        if (obj3 == uniqueTag) {
            obj3 = ScriptRuntime.wrapNumber(dArr[i4]);
        }
        objArr[i4] = ScriptRuntime.memberRef(obj3, obj2, obj, context, i2);
        return i4;
    }

    private static int doRefNsName(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i, int i2) {
        Object obj = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        int i3 = i - 1;
        Object obj2 = objArr[i3];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i3]);
        }
        objArr[i3] = ScriptRuntime.nameRef(obj2, obj, context, callFrame.scope, i2);
        return i3;
    }

    private static int doSetConstVar(CallFrame callFrame, Object[] objArr, double[] dArr, int i, Object[] objArr2, double[] dArr2, int[] iArr, int i2) {
        if (!callFrame.useActivation) {
            int i3 = iArr[i2];
            if ((i3 & 1) != 0) {
                if ((i3 & 8) != 0) {
                    objArr2[i2] = objArr[i];
                    iArr[i2] = i3 & (-9);
                    dArr2[i2] = dArr[i];
                }
                return i;
            }
            throw Context.reportRuntimeErrorById("msg.var.redecl", callFrame.idata.argNames[i2]);
        }
        Object obj = objArr[i];
        if (obj == UniqueTag.DOUBLE_MARK) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        String str = callFrame.idata.argNames[i2];
        Scriptable scriptable = callFrame.scope;
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).putConst(str, scriptable, obj);
            return i;
        }
        throw Kit.codeBug();
    }

    private static int doSetElem(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i) {
        Object objectIndex;
        int i2 = i - 2;
        Object obj = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        Object obj2 = obj;
        Object obj3 = objArr[i2];
        if (obj3 == uniqueTag) {
            obj3 = ScriptRuntime.wrapNumber(dArr[i2]);
        }
        Object obj4 = obj3;
        int i3 = i - 1;
        Object obj5 = objArr[i3];
        if (obj5 != uniqueTag) {
            objectIndex = ScriptRuntime.setObjectElem(obj4, obj5, obj2, context, callFrame.scope);
        } else {
            objectIndex = ScriptRuntime.setObjectIndex(obj4, dArr[i3], obj2, context, callFrame.scope);
        }
        objArr[i2] = objectIndex;
        return i2;
    }

    private static int doSetElemSuper(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i) {
        Object superIndex;
        int i2 = i - 2;
        Object obj = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        Object obj2 = obj;
        Object obj3 = objArr[i2];
        if (obj3 == uniqueTag) {
            Kit.codeBug();
        }
        int i3 = i - 1;
        Object obj4 = objArr[i3];
        if (obj4 != uniqueTag) {
            superIndex = ScriptRuntime.setSuperElem(obj3, obj4, obj2, context, callFrame.scope, callFrame.thisObj);
        } else {
            superIndex = ScriptRuntime.setSuperIndex(obj3, dArr[i3], obj2, context, callFrame.scope, callFrame.thisObj);
        }
        objArr[i2] = superIndex;
        return i2;
    }

    private static int doSetVar(CallFrame callFrame, Object[] objArr, double[] dArr, int i, Object[] objArr2, double[] dArr2, int[] iArr, int i2) {
        if (!callFrame.useActivation) {
            if ((iArr[i2] & 1) == 0) {
                objArr2[i2] = objArr[i];
                dArr2[i2] = dArr[i];
            }
            return i;
        }
        Object obj = objArr[i];
        if (obj == UniqueTag.DOUBLE_MARK) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        String str = callFrame.idata.argNames[i2];
        Scriptable scriptable = callFrame.scope;
        scriptable.put(str, scriptable, obj);
        return i;
    }

    private static boolean doShallowEquals(Object[] objArr, double[] dArr, int i) {
        double d;
        double doubleValue;
        int i2 = i + 1;
        Object obj = objArr[i2];
        Object obj2 = objArr[i];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            doubleValue = dArr[i2];
            if (obj2 == uniqueTag) {
                d = dArr[i];
            } else if (!(obj2 instanceof Number) || (obj2 instanceof BigInteger)) {
                return false;
            } else {
                d = ((Number) obj2).doubleValue();
            }
        } else if (obj2 == uniqueTag) {
            d = dArr[i];
            if ((obj instanceof Number) && !(obj instanceof BigInteger)) {
                doubleValue = ((Number) obj).doubleValue();
            }
            return false;
        } else {
            return ScriptRuntime.shallowEq(obj2, obj);
        }
        if (d != doubleValue) {
            return false;
        }
        return true;
    }

    private static int doVarIncDec(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i, Object[] objArr2, double[] dArr2, int[] iArr, int i2) {
        double doubleValue;
        BigInteger subtract;
        double d;
        int i3 = i + 1;
        InterpreterData interpreterData = callFrame.idata;
        byte b = interpreterData.itsICode[callFrame.pc];
        if (!callFrame.useActivation) {
            Object obj = objArr2[i2];
            UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
            BigInteger bigInteger = null;
            if (obj == uniqueTag) {
                doubleValue = dArr2[i2];
            } else {
                Number numeric = ScriptRuntime.toNumeric(obj);
                if (numeric instanceof BigInteger) {
                    bigInteger = (BigInteger) numeric;
                    doubleValue = 0.0d;
                } else {
                    doubleValue = numeric.doubleValue();
                }
            }
            boolean z = false;
            if (bigInteger == null) {
                if ((b & 1) == 0) {
                    d = 1.0d + doubleValue;
                } else {
                    d = doubleValue - 1.0d;
                }
                if ((b & 2) != 0) {
                    z = true;
                }
                if ((iArr[i2] & 1) == 0) {
                    if (obj != uniqueTag) {
                        objArr2[i2] = uniqueTag;
                    }
                    dArr2[i2] = d;
                    objArr[i3] = uniqueTag;
                    if (!z) {
                        doubleValue = d;
                    }
                    dArr[i3] = doubleValue;
                } else if (z && obj != uniqueTag) {
                    objArr[i3] = obj;
                } else {
                    objArr[i3] = uniqueTag;
                    if (!z) {
                        doubleValue = d;
                    }
                    dArr[i3] = doubleValue;
                }
            } else {
                if ((b & 1) == 0) {
                    subtract = bigInteger.add(BigInteger.ONE);
                } else {
                    subtract = bigInteger.subtract(BigInteger.ONE);
                }
                if ((b & 2) != 0) {
                    z = true;
                }
                if ((iArr[i2] & 1) == 0) {
                    objArr2[i2] = subtract;
                    if (!z) {
                        bigInteger = subtract;
                    }
                    objArr[i3] = bigInteger;
                } else if (z && obj != uniqueTag) {
                    objArr[i3] = obj;
                } else {
                    if (!z) {
                        bigInteger = subtract;
                    }
                    objArr[i3] = bigInteger;
                }
            }
        } else {
            objArr[i3] = ScriptRuntime.nameIncrDecr(callFrame.scope, interpreterData.argNames[i2], context, b);
        }
        callFrame.pc++;
        return i3;
    }

    private static void enterFrame(Context context, CallFrame callFrame, Object[] objArr, boolean z) {
        boolean z2;
        CallFrame callFrame2;
        boolean z3 = callFrame.idata.itsNeedsActivation;
        if (callFrame.debuggerFrame != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 || z2) {
            Scriptable scriptable = callFrame.scope;
            if (scriptable == null) {
                Kit.codeBug();
            } else if (z) {
                while (scriptable instanceof NativeWith) {
                    scriptable = scriptable.getParentScope();
                    if (scriptable == null || ((callFrame2 = callFrame.parentFrame) != null && callFrame2.scope == scriptable)) {
                        Kit.codeBug();
                        break;
                    }
                }
            }
            if (z2) {
                callFrame.debuggerFrame.onEnter(context, scriptable, callFrame.thisObj, objArr);
            }
            if (z3) {
                ScriptRuntime.enterActivationFunction(context, scriptable);
            }
        }
    }

    private static void exitFrame(Context context, CallFrame callFrame, Object obj) {
        Object obj2;
        double d;
        if (callFrame.idata.itsNeedsActivation) {
            ScriptRuntime.exitActivationFunction(context);
        }
        DebugFrame debugFrame = callFrame.debuggerFrame;
        if (debugFrame != null) {
            try {
                if (obj instanceof Throwable) {
                    debugFrame.onExit(context, true, obj);
                    return;
                }
                ContinuationJump continuationJump = (ContinuationJump) obj;
                if (continuationJump == null) {
                    obj2 = callFrame.result;
                } else {
                    obj2 = continuationJump.result;
                }
                if (obj2 == UniqueTag.DOUBLE_MARK) {
                    if (continuationJump == null) {
                        d = callFrame.resultDbl;
                    } else {
                        d = continuationJump.resultDbl;
                    }
                    obj2 = ScriptRuntime.wrapNumber(d);
                }
                callFrame.debuggerFrame.onExit(context, false, obj2);
            } catch (Throwable th) {
                System.err.println("RHINO USAGE WARNING: onExit terminated with exception");
                th.printStackTrace(System.err);
            }
        }
    }

    private static Object freezeGenerator(Context context, CallFrame callFrame, int i, GeneratorState generatorState, boolean z) {
        if (generatorState.operation != 2) {
            callFrame.frozen = true;
            callFrame.result = callFrame.stack[i];
            callFrame.resultDbl = callFrame.sDbl[i];
            callFrame.savedStackTop = i;
            callFrame.pc--;
            ScriptRuntime.exitActivationFunction(context);
            Object obj = callFrame.result;
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(callFrame.resultDbl);
            }
            if (z) {
                return new ES6Generator.YieldStarResult(obj);
            }
            return obj;
        }
        throw ScriptRuntime.typeErrorById("msg.yield.closing", new Object[0]);
    }

    private static Scriptable getApplyThis(Context context, Object[] objArr, double[] dArr, int i, int i2, Callable callable, CallFrame callFrame) {
        Object obj = null;
        Scriptable scriptable = null;
        if (callable instanceof InterpretedFunction) {
            if (i2 != 0) {
                Object obj2 = objArr[i];
                if (obj2 == UniqueTag.DOUBLE_MARK) {
                    obj2 = ScriptRuntime.wrapNumber(dArr[i]);
                }
                scriptable = ScriptRuntime.toObjectOrNull(context, obj2, callFrame.scope);
            }
            if (scriptable == null) {
                return ScriptRuntime.getTopCallScope(context);
            }
            return scriptable;
        }
        if (i2 != 0 && (obj = objArr[i]) == UniqueTag.DOUBLE_MARK) {
            obj = ScriptRuntime.wrapNumber(dArr[i]);
        }
        return ScriptRuntime.getApplyOrCallThis(context, callFrame.scope, obj, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object[] getArgsArray(Object[] objArr, double[] dArr, int i, int i2) {
        if (i2 == 0) {
            return ScriptRuntime.emptyArgs;
        }
        Object[] objArr2 = new Object[i2];
        int i3 = 0;
        while (i3 != i2) {
            Object obj = objArr[i];
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(dArr[i]);
            }
            objArr2[i3] = obj;
            i3++;
            i++;
        }
        return objArr2;
    }

    private static Scriptable getCurrentFrameHomeObject(CallFrame callFrame) {
        Scriptable scriptable = callFrame.scope;
        if (scriptable instanceof NativeCall) {
            return ((NativeCall) scriptable).getHomeObject();
        }
        return null;
    }

    private static int getExceptionHandler(CallFrame callFrame, boolean z) {
        int[] iArr = callFrame.idata.itsExceptionTable;
        int i = -1;
        if (iArr == null) {
            return -1;
        }
        int i2 = callFrame.pc - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 != iArr.length; i5 += 6) {
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (i6 <= i2 && i2 < i7 && (!z || iArr[i5 + 3] == 1)) {
                if (i >= 0) {
                    if (i3 >= i7) {
                        if (i4 > i6) {
                            Kit.codeBug();
                        }
                        if (i3 == i7) {
                            Kit.codeBug();
                        }
                    }
                }
                i = i5;
                i4 = i6;
                i3 = i7;
            }
        }
        return i;
    }

    private static int getIndex(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    private static int getInt(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int[] getLineNumbers(InterpreterData interpreterData) {
        HashSet hashSet = new HashSet();
        byte[] bArr = interpreterData.itsICode;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 != length) {
            byte b = bArr[i2];
            int bytecodeSpan = bytecodeSpan(b);
            if (b == -31) {
                if (bytecodeSpan != 3) {
                    Kit.codeBug();
                }
                hashSet.add(Integer.valueOf(getIndex(bArr, i2 + 1)));
            }
            i2 += bytecodeSpan;
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static String getRawSource(InterpreterData interpreterData) {
        String str = interpreterData.rawSource;
        if (str == null) {
            return null;
        }
        return str.substring(interpreterData.rawSourceStart, interpreterData.rawSourceEnd);
    }

    private static int getShort(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | (bArr[i] << 8);
    }

    private static CallFrame initFrame(Context context, Scriptable scriptable, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr, double[] dArr, int i, int i2, InterpretedFunction interpretedFunction, CallFrame callFrame) {
        CallFrame callFrame2 = new CallFrame(context, scriptable2, interpretedFunction, callFrame);
        callFrame2.initializeArgs(context, scriptable, objArr, dArr, i, i2, scriptable3);
        enterFrame(context, callFrame2, objArr, false);
        return callFrame2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initFunction(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int i) {
        InterpretedFunction createFunction = InterpretedFunction.createFunction(context, scriptable, interpretedFunction, i);
        ScriptRuntime.initFunction(context, scriptable, createFunction, createFunction.idata.itsFunctionType, interpretedFunction.idata.evalScriptFlag);
    }

    public static Object interpret(InterpretedFunction interpretedFunction, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!ScriptRuntime.hasTopCall(context)) {
            Kit.codeBug();
        }
        Object obj = context.interpreterSecurityDomain;
        Object obj2 = interpretedFunction.securityDomain;
        if (obj != obj2) {
            context.interpreterSecurityDomain = obj2;
            try {
                return interpretedFunction.securityController.callWithDomain(obj2, context, interpretedFunction, scriptable, scriptable2, objArr);
            } finally {
                context.interpreterSecurityDomain = obj;
            }
        }
        CallFrame initFrame = initFrame(context, scriptable, scriptable2, interpretedFunction.getHomeObject(), objArr, null, 0, objArr.length, interpretedFunction, null);
        initFrame.isContinuationsTopFrame = context.isContinuationsTopCall;
        context.isContinuationsTopCall = false;
        return interpretLoop(context, initFrame, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1070:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03ee, code lost:
        r2 = r6;
        r4 = r12;
        r36 = r14;
        r15 = r23;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03f4, code lost:
        r5 = r34;
        r0 = r0;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f6, code lost:
        r33 = 0;
        r0 = r0;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0996, code lost:
        r1 = r31;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x14db, code lost:
        exitFrame(r6, r2, r1);
        r1 = r2.result;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x14e0, code lost:
        r3 = r2.resultDbl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x14e2, code lost:
        r2 = r2.parentFrame;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x14e4, code lost:
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x14e8, code lost:
        if (r2.frozen == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x14ea, code lost:
        r2 = r2.cloneFrozen();
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x14f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x14f1, code lost:
        r19 = r1;
        r20 = r3;
        r1 = r6;
        r4 = r12;
        r5 = r34;
        r32 = 1;
        r33 = 0;
        r3 = r2;
        r0 = r0;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x1502, code lost:
        setCallResult(r2, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x1505, code lost:
        r20 = r3;
        r1 = r6;
        r0 = r8;
        r4 = r12;
        r7 = r15;
        r5 = r34;
        r14 = r36;
        r13 = 1;
        r15 = null;
        r19 = null;
        r3 = r2;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x1518, code lost:
        r0 = r1;
        r1 = r6;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x151e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x151f, code lost:
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1861, code lost:
        if (r1.hasFeature(13) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x186f, code lost:
        if (r1.hasFeature(13) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x1880, code lost:
        if (r1.hasFeature(13) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x18eb, code lost:
        r5 = r1.previousInterpreterInvocations;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x18ed, code lost:
        if (r5 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x18f3, code lost:
        if (r5.size() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x18f5, code lost:
        r1.lastInterpreterFrame = r1.previousInterpreterInvocations.pop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x18fe, code lost:
        r1.lastInterpreterFrame = null;
        r1.previousInterpreterInvocations = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1903, code lost:
        if (r2 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1907, code lost:
        if ((r2 instanceof java.lang.RuntimeException) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x190b, code lost:
        throw ((java.lang.RuntimeException) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x190e, code lost:
        throw ((java.lang.Error) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x190f, code lost:
        if (r0 == r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1916, code lost:
        return org.mozilla.javascript.ScriptRuntime.wrapNumber(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x18cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x107e A[Catch: all -> 0x0f0a, TryCatch #31 {all -> 0x0f0a, blocks: (B:502:0x1070, B:504:0x107e, B:506:0x1089, B:466:0x0f00, B:468:0x0f07, B:476:0x0f24, B:478:0x0f3b, B:479:0x0f44, B:481:0x0f50, B:485:0x0f81, B:486:0x0fa3, B:490:0x0fc4, B:492:0x0fd6, B:494:0x0fdd, B:495:0x0ff0, B:496:0x1011, B:498:0x1026, B:499:0x102c, B:500:0x103e, B:514:0x10f4, B:515:0x1111, B:516:0x112d, B:517:0x1148, B:518:0x115f, B:519:0x1174, B:520:0x1189, B:521:0x119e, B:522:0x11bb, B:523:0x11da, B:524:0x11f8, B:531:0x123f, B:537:0x127a, B:539:0x128c, B:540:0x12ab, B:541:0x12c8, B:543:0x12e0, B:544:0x12e6, B:545:0x12f1, B:547:0x1311, B:548:0x1323, B:551:0x133f, B:552:0x135a, B:554:0x138b, B:555:0x13ba, B:557:0x13d2, B:558:0x13d8, B:559:0x13e6), top: B:847:0x1070 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1548 A[Catch: all -> 0x1442, TRY_LEAVE, TryCatch #22 {all -> 0x1442, blocks: (B:594:0x1538, B:600:0x1543, B:602:0x1548, B:578:0x14db, B:562:0x141f, B:564:0x1423, B:566:0x1435, B:569:0x144e, B:570:0x145b, B:571:0x1480, B:573:0x1498, B:574:0x149d, B:576:0x14bf, B:577:0x14c5), top: B:831:0x1538 }] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x172e A[Catch: all -> 0x1744, TryCatch #24 {all -> 0x1744, blocks: (B:644:0x172a, B:646:0x172e, B:650:0x1748, B:652:0x174c, B:654:0x1760, B:656:0x1764, B:657:0x176f, B:659:0x1774, B:660:0x1779, B:662:0x1781, B:665:0x17a1, B:663:0x1789, B:668:0x17ab), top: B:835:0x172a }] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x1748 A[Catch: all -> 0x1744, TryCatch #24 {all -> 0x1744, blocks: (B:644:0x172a, B:646:0x172e, B:650:0x1748, B:652:0x174c, B:654:0x1760, B:656:0x1764, B:657:0x176f, B:659:0x1774, B:660:0x1779, B:662:0x1781, B:665:0x17a1, B:663:0x1789, B:668:0x17ab), top: B:835:0x172a }] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x1774 A[Catch: all -> 0x1744, TryCatch #24 {all -> 0x1744, blocks: (B:644:0x172a, B:646:0x172e, B:650:0x1748, B:652:0x174c, B:654:0x1760, B:656:0x1764, B:657:0x176f, B:659:0x1774, B:660:0x1779, B:662:0x1781, B:665:0x17a1, B:663:0x1789, B:668:0x17ab), top: B:835:0x172a }] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x1781 A[Catch: all -> 0x1744, TryCatch #24 {all -> 0x1744, blocks: (B:644:0x172a, B:646:0x172e, B:650:0x1748, B:652:0x174c, B:654:0x1760, B:656:0x1764, B:657:0x176f, B:659:0x1774, B:660:0x1779, B:662:0x1781, B:665:0x17a1, B:663:0x1789, B:668:0x17ab), top: B:835:0x172a }] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x1789 A[Catch: all -> 0x1744, TryCatch #24 {all -> 0x1744, blocks: (B:644:0x172a, B:646:0x172e, B:650:0x1748, B:652:0x174c, B:654:0x1760, B:656:0x1764, B:657:0x176f, B:659:0x1774, B:660:0x1779, B:662:0x1781, B:665:0x17a1, B:663:0x1789, B:668:0x17ab), top: B:835:0x172a }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x17a1 A[Catch: all -> 0x1744, TryCatch #24 {all -> 0x1744, blocks: (B:644:0x172a, B:646:0x172e, B:650:0x1748, B:652:0x174c, B:654:0x1760, B:656:0x1764, B:657:0x176f, B:659:0x1774, B:660:0x1779, B:662:0x1781, B:665:0x17a1, B:663:0x1789, B:668:0x17ab), top: B:835:0x172a }] */
    /* JADX WARN: Removed duplicated region for block: B:689:0x182a  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x182d  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x1832  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x1846  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x1857  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x1885  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x1899  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x18b4  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x1917  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:875:0x1922 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:886:0x153c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x17ca A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v423, types: [org.mozilla.javascript.Interpreter$GeneratorState] */
    /* JADX WARN: Type inference failed for: r15v201 */
    /* JADX WARN: Type inference failed for: r15v208 */
    /* JADX WARN: Type inference failed for: r15v209 */
    /* JADX WARN: Type inference failed for: r15v210 */
    /* JADX WARN: Type inference failed for: r15v263 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v45, types: [org.mozilla.javascript.Interpreter$GeneratorState] */
    /* JADX WARN: Type inference failed for: r15v46, types: [org.mozilla.javascript.Interpreter$GeneratorState] */
    /* JADX WARN: Type inference failed for: r15v47, types: [org.mozilla.javascript.Interpreter$GeneratorState] */
    /* JADX WARN: Type inference failed for: r15v5, types: [org.mozilla.javascript.Interpreter$GeneratorState] */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r1v245 */
    /* JADX WARN: Type inference failed for: r1v246, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v114 */
    /* JADX WARN: Type inference failed for: r5v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r6v125 */
    /* JADX WARN: Type inference failed for: r6v257 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object interpretLoop(org.mozilla.javascript.Context r39, org.mozilla.javascript.Interpreter.CallFrame r40, java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 6806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Interpreter.interpretLoop(org.mozilla.javascript.Context, org.mozilla.javascript.Interpreter$CallFrame, java.lang.Object):java.lang.Object");
    }

    private static CallFrame processThrowable(Context context, Object obj, CallFrame callFrame, int i, boolean z) {
        if (i >= 0) {
            if (callFrame.frozen) {
                callFrame = callFrame.cloneFrozen();
            }
            int[] iArr = callFrame.idata.itsExceptionTable;
            int i2 = iArr[i + 2];
            callFrame.pc = i2;
            if (z) {
                callFrame.pcPrevBranch = i2;
            }
            callFrame.savedStackTop = callFrame.emptyStackTop;
            int i3 = callFrame.localShift;
            int i4 = iArr[i + 5] + i3;
            int i5 = i3 + iArr[i + 4];
            Object[] objArr = callFrame.stack;
            callFrame.scope = (Scriptable) objArr[i4];
            objArr[i5] = obj;
        } else {
            ContinuationJump continuationJump = (ContinuationJump) obj;
            if (!Objects.equals(continuationJump.branchFrame, callFrame)) {
                Kit.codeBug();
            }
            if (continuationJump.capturedFrame == null) {
                Kit.codeBug();
            }
            CallFrame callFrame2 = continuationJump.capturedFrame;
            int i6 = callFrame2.frameIndex + 1;
            CallFrame callFrame3 = continuationJump.branchFrame;
            if (callFrame3 != null) {
                i6 -= callFrame3.frameIndex;
            }
            CallFrame[] callFrameArr = null;
            int i7 = 0;
            for (int i8 = 0; i8 != i6; i8++) {
                if (!callFrame2.frozen) {
                    Kit.codeBug();
                }
                if (callFrame2.useActivation) {
                    if (callFrameArr == null) {
                        callFrameArr = new CallFrame[i6 - i8];
                    }
                    callFrameArr[i7] = callFrame2;
                    i7++;
                }
                callFrame2 = callFrame2.parentFrame;
            }
            while (i7 != 0) {
                i7--;
                enterFrame(context, callFrameArr[i7], ScriptRuntime.emptyArgs, true);
            }
            callFrame = continuationJump.capturedFrame.cloneFrozen();
            setCallResult(callFrame, continuationJump.result, continuationJump.resultDbl);
        }
        callFrame.throwable = null;
        return callFrame;
    }

    public static Object restartContinuation(NativeContinuation nativeContinuation, Context context, Scriptable scriptable, Object[] objArr) {
        Object obj;
        if (!ScriptRuntime.hasTopCall(context)) {
            return ScriptRuntime.doTopCall(nativeContinuation, context, scriptable, null, objArr, context.isTopLevelStrict);
        }
        if (objArr.length == 0) {
            obj = Undefined.instance;
        } else {
            obj = objArr[0];
        }
        if (((CallFrame) nativeContinuation.getImplementation()) == null) {
            return obj;
        }
        ContinuationJump continuationJump = new ContinuationJump(nativeContinuation, null);
        continuationJump.result = obj;
        return interpretLoop(context, null, continuationJump);
    }

    public static Object resumeGenerator(Context context, Scriptable scriptable, int i, Object obj, Object obj2) {
        CallFrame callFrame = (CallFrame) obj;
        GeneratorState generatorState = new GeneratorState(i, obj2);
        if (i == 2) {
            try {
                return interpretLoop(context, callFrame, generatorState);
            } catch (RuntimeException e) {
                if (e == obj2) {
                    return Undefined.instance;
                }
                throw e;
            }
        }
        Object interpretLoop = interpretLoop(context, callFrame, generatorState);
        RuntimeException runtimeException = generatorState.returnedException;
        if (runtimeException == null) {
            return interpretLoop;
        }
        throw runtimeException;
    }

    private static void setCallResult(CallFrame callFrame, Object obj, double d) {
        int i = callFrame.savedCallOp;
        if (i != 43 && i != -85) {
            if (i == 30) {
                if (obj instanceof Scriptable) {
                    callFrame.stack[callFrame.savedStackTop] = obj;
                }
            } else {
                Kit.codeBug();
            }
        } else {
            Object[] objArr = callFrame.stack;
            int i2 = callFrame.savedStackTop;
            objArr[i2] = obj;
            callFrame.sDbl[i2] = d;
        }
        callFrame.savedCallOp = 0;
    }

    private static boolean stack_boolean(CallFrame callFrame, int i) {
        Object obj = callFrame.stack[i];
        if (Boolean.TRUE.equals(obj)) {
            return true;
        }
        if (Boolean.FALSE.equals(obj)) {
            return false;
        }
        if (obj == UniqueTag.DOUBLE_MARK) {
            double d = callFrame.sDbl[i];
            if (!Double.isNaN(d) && d != 0.0d) {
                return true;
            }
            return false;
        } else if (obj == null || obj == Undefined.instance) {
            return false;
        } else {
            if (obj instanceof BigInteger) {
                return !obj.equals(BigInteger.ZERO);
            }
            if (obj instanceof Number) {
                double doubleValue = ((Number) obj).doubleValue();
                if (!Double.isNaN(doubleValue) && doubleValue != 0.0d) {
                    return true;
                }
                return false;
            }
            return ScriptRuntime.toBoolean(obj);
        }
    }

    private static double stack_double(CallFrame callFrame, int i) {
        Object obj = callFrame.stack[i];
        if (obj != UniqueTag.DOUBLE_MARK) {
            return ScriptRuntime.toNumber(obj);
        }
        return callFrame.sDbl[i];
    }

    private static int stack_int32(CallFrame callFrame, int i) {
        Object obj = callFrame.stack[i];
        if (obj == UniqueTag.DOUBLE_MARK) {
            return ScriptRuntime.toInt32(callFrame.sDbl[i]);
        }
        return ScriptRuntime.toInt32(obj);
    }

    private static Number stack_numeric(CallFrame callFrame, int i) {
        Object obj = callFrame.stack[i];
        if (obj != UniqueTag.DOUBLE_MARK) {
            return ScriptRuntime.toNumeric(obj);
        }
        return Double.valueOf(callFrame.sDbl[i]);
    }

    private static Object thawGenerator(CallFrame callFrame, int i, GeneratorState generatorState, int i2) {
        callFrame.frozen = false;
        int index = getIndex(callFrame.idata.itsICode, callFrame.pc);
        callFrame.pc += 2;
        int i3 = generatorState.operation;
        if (i3 == 1) {
            return new JavaScriptException(generatorState.value, callFrame.idata.itsSourceFile, index);
        }
        if (i3 == 2) {
            return generatorState.value;
        }
        if (i3 == 0) {
            if (i2 == 78 || i2 == -73) {
                callFrame.stack[i] = generatorState.value;
            }
            return Scriptable.NOT_FOUND;
        }
        throw Kit.codeBug();
    }

    @Override // org.mozilla.javascript.Evaluator
    public void captureStackInfo(RhinoException rhinoException) {
        CallFrame[] callFrameArr;
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.lastInterpreterFrame != null) {
            Deque<Object> deque = currentContext.previousInterpreterInvocations;
            if (deque != null && deque.size() != 0) {
                int size = currentContext.previousInterpreterInvocations.size();
                if (currentContext.previousInterpreterInvocations.peek() == currentContext.lastInterpreterFrame) {
                    size--;
                }
                callFrameArr = new CallFrame[size + 1];
                ArrayList arrayList = new ArrayList(currentContext.previousInterpreterInvocations);
                Collections.reverse(arrayList);
                arrayList.toArray(callFrameArr);
            } else {
                callFrameArr = new CallFrame[1];
            }
            callFrameArr[callFrameArr.length - 1] = (CallFrame) currentContext.lastInterpreterFrame;
            int i = 0;
            for (int i2 = 0; i2 != callFrameArr.length; i2++) {
                i += callFrameArr[i2].frameIndex + 1;
            }
            int[] iArr = new int[i];
            int length = callFrameArr.length;
            while (length != 0) {
                length--;
                for (CallFrame callFrame = callFrameArr[length]; callFrame != null; callFrame = callFrame.parentFrame) {
                    i--;
                    iArr[i] = callFrame.pcSourceLineStart;
                }
            }
            if (i != 0) {
                Kit.codeBug();
            }
            rhinoException.interpreterStackInfo = callFrameArr;
            rhinoException.interpreterLineData = iArr;
            return;
        }
        rhinoException.interpreterStackInfo = null;
        rhinoException.interpreterLineData = null;
    }

    @Override // org.mozilla.javascript.Evaluator
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z) {
        InterpreterData compile = new CodeGenerator().compile(compilerEnvirons, scriptNode, str, z);
        this.itsData = compile;
        return compile;
    }

    @Override // org.mozilla.javascript.Evaluator
    public Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2) {
        if (obj != this.itsData) {
            Kit.codeBug();
        }
        return InterpretedFunction.createFunction(context, scriptable, this.itsData, obj2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public Script createScriptObject(Object obj, Object obj2) {
        if (obj != this.itsData) {
            Kit.codeBug();
        }
        return InterpretedFunction.createScript(this.itsData, obj2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getPatchedStack(RhinoException rhinoException, String str) {
        char charAt;
        StringBuilder sb = new StringBuilder(str.length() + 1000);
        String systemProperty = SecurityUtilities.getSystemProperty("line.separator");
        CallFrame[] callFrameArr = (CallFrame[]) rhinoException.interpreterStackInfo;
        int[] iArr = rhinoException.interpreterLineData;
        int length = callFrameArr.length;
        int length2 = iArr.length;
        int i = 0;
        while (length != 0) {
            length--;
            int indexOf = str.indexOf("org.mozilla.javascript.Interpreter.interpretLoop", i);
            if (indexOf < 0) {
                break;
            }
            int i2 = indexOf + 48;
            while (i2 != str.length() && (charAt = str.charAt(i2)) != '\n' && charAt != '\r') {
                i2++;
            }
            sb.append((CharSequence) str, i, i2);
            for (CallFrame callFrame = callFrameArr[length]; callFrame != null; callFrame = callFrame.parentFrame) {
                if (length2 == 0) {
                    Kit.codeBug();
                }
                length2--;
                InterpreterData interpreterData = callFrame.idata;
                sb.append(systemProperty);
                sb.append("\tat script");
                String str2 = interpreterData.itsName;
                if (str2 != null && str2.length() != 0) {
                    sb.append('.');
                    sb.append(interpreterData.itsName);
                }
                sb.append('(');
                sb.append(interpreterData.itsSourceFile);
                int i3 = iArr[length2];
                if (i3 >= 0) {
                    sb.append(':');
                    sb.append(getIndex(interpreterData.itsICode, i3));
                }
                sb.append(')');
            }
            i = i2;
        }
        sb.append(str.substring(i));
        return sb.toString();
    }

    @Override // org.mozilla.javascript.Evaluator
    public List<String> getScriptStack(RhinoException rhinoException) {
        ScriptStackElement[][] scriptStackElements = getScriptStackElements(rhinoException);
        ArrayList arrayList = new ArrayList(scriptStackElements.length);
        String systemProperty = SecurityUtilities.getSystemProperty("line.separator");
        for (ScriptStackElement[] scriptStackElementArr : scriptStackElements) {
            StringBuilder sb = new StringBuilder();
            for (ScriptStackElement scriptStackElement : scriptStackElementArr) {
                scriptStackElement.renderJavaStyle(sb);
                sb.append(systemProperty);
            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public ScriptStackElement[][] getScriptStackElements(RhinoException rhinoException) {
        int i;
        String str;
        if (rhinoException.interpreterStackInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CallFrame[] callFrameArr = (CallFrame[]) rhinoException.interpreterStackInfo;
        int[] iArr = rhinoException.interpreterLineData;
        int length = callFrameArr.length;
        int length2 = iArr.length;
        while (length != 0) {
            length--;
            CallFrame callFrame = callFrameArr[length];
            ArrayList arrayList2 = new ArrayList();
            while (callFrame != null) {
                if (length2 == 0) {
                    Kit.codeBug();
                }
                length2--;
                InterpreterData interpreterData = callFrame.idata;
                String str2 = interpreterData.itsSourceFile;
                int i2 = iArr[length2];
                if (i2 >= 0) {
                    i = getIndex(interpreterData.itsICode, i2);
                } else {
                    i = -1;
                }
                String str3 = interpreterData.itsName;
                if (str3 != null && str3.length() != 0) {
                    str = interpreterData.itsName;
                } else {
                    str = null;
                }
                callFrame = callFrame.parentFrame;
                arrayList2.add(new ScriptStackElement(str2, str, i));
            }
            arrayList.add((ScriptStackElement[]) arrayList2.toArray(new ScriptStackElement[0]));
        }
        return (ScriptStackElement[][]) arrayList.toArray(new ScriptStackElement[arrayList.size()]);
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getSourcePositionFromStack(Context context, int[] iArr) {
        CallFrame callFrame = (CallFrame) context.lastInterpreterFrame;
        InterpreterData interpreterData = callFrame.idata;
        int i = callFrame.pcSourceLineStart;
        if (i >= 0) {
            iArr[0] = getIndex(interpreterData.itsICode, i);
        } else {
            iArr[0] = 0;
        }
        return interpreterData.itsSourceFile;
    }

    @Override // org.mozilla.javascript.Evaluator
    public void setEvalScriptFlag(Script script) {
        ((InterpretedFunction) script).idata.evalScriptFlag = true;
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class NewState {
        public /* synthetic */ NewState(int i) {
            this();
        }

        private NewState() {
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class NewThrowable extends NewState {
        private final Object throwable;

        private NewThrowable(Object obj) {
            super(0);
            this.throwable = obj;
        }

        public /* synthetic */ NewThrowable(Object obj, int i) {
            this(obj);
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class StateContinue extends NewState {
        private final CallFrame frame;

        private StateContinue(CallFrame callFrame) {
            super(0);
            this.frame = callFrame;
        }

        public /* synthetic */ StateContinue(CallFrame callFrame, int i) {
            this(callFrame);
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class ContinueLoop extends NewState {
        private final CallFrame frame;
        private final int indexReg;
        private final int stackTop;

        private ContinueLoop(CallFrame callFrame, int i, int i2) {
            super(0);
            this.frame = callFrame;
            this.stackTop = i;
            this.indexReg = i2;
        }

        public /* synthetic */ ContinueLoop(CallFrame callFrame, int i, int i2, int i3) {
            this(callFrame, i, i2);
        }
    }

    public static void dumpICode(InterpreterData interpreterData) {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class CallFrame implements Cloneable, Serializable {
        private static final long serialVersionUID = -2843792508994958978L;
        final DebugFrame debuggerFrame;
        final int emptyStackTop;
        final InterpretedFunction fnOrScript;
        int frameIndex;
        boolean frozen;
        final InterpreterData idata;
        boolean isContinuationsTopFrame;
        final int localShift;
        CallFrame parentFrame;
        int pc;
        int pcPrevBranch;
        int pcSourceLineStart;
        Object result;
        double resultDbl;
        double[] sDbl;
        int savedCallOp;
        int savedStackTop;
        Scriptable scope;
        Object[] stack;
        int[] stackAttributes;
        final Scriptable thisObj;
        Object throwable;
        final boolean useActivation;
        final CallFrame varSource;

        public CallFrame(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, CallFrame callFrame) {
            DebugFrame debugFrame;
            boolean z;
            InterpreterData interpreterData = interpretedFunction.idata;
            this.idata = interpreterData;
            Debugger debugger = context.debugger;
            if (debugger != null) {
                debugFrame = debugger.getFrame(context, interpreterData);
            } else {
                debugFrame = null;
            }
            this.debuggerFrame = debugFrame;
            if (debugFrame == null && !interpreterData.itsNeedsActivation) {
                z = false;
            } else {
                z = true;
            }
            this.useActivation = z;
            int i = interpreterData.itsMaxVars;
            int i2 = (interpreterData.itsMaxLocals + i) - 1;
            this.emptyStackTop = i2;
            this.fnOrScript = interpretedFunction;
            this.varSource = this;
            this.localShift = i;
            this.thisObj = scriptable;
            this.parentFrame = callFrame;
            int i3 = callFrame != null ? callFrame.frameIndex + 1 : 0;
            this.frameIndex = i3;
            if (i3 <= context.getMaximumInterpreterStackDepth()) {
                this.result = Undefined.instance;
                this.pcSourceLineStart = interpreterData.firstLinePC;
                this.savedStackTop = i2;
                return;
            }
            throw Context.reportRuntimeError("Exceeded maximum stack depth");
        }

        private Boolean equalsInTopScope(final Object obj) {
            return (Boolean) EqualObjectGraphs.withThreadLocal(new java.util.function.Function() { // from class: org.mozilla.javascript.d
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Boolean lambda$equalsInTopScope$1;
                    lambda$equalsInTopScope$1 = Interpreter.CallFrame.this.lambda$equalsInTopScope$1(obj, (EqualObjectGraphs) obj2);
                    return lambda$equalsInTopScope$1;
                }
            });
        }

        private boolean fieldsEqual(CallFrame callFrame, EqualObjectGraphs equalObjectGraphs) {
            if (this.frameIndex == callFrame.frameIndex && this.pc == callFrame.pc && Interpreter.compareIdata(this.idata, callFrame.idata) && equalObjectGraphs.equalGraphs(this.varSource.stack, callFrame.varSource.stack) && Arrays.equals(this.varSource.sDbl, callFrame.varSource.sDbl) && equalObjectGraphs.equalGraphs(this.thisObj, callFrame.thisObj) && equalObjectGraphs.equalGraphs(this.fnOrScript, callFrame.fnOrScript) && equalObjectGraphs.equalGraphs(this.scope, callFrame.scope)) {
                return true;
            }
            return false;
        }

        private boolean isStrictTopFrame() {
            while (true) {
                CallFrame callFrame = this.parentFrame;
                if (callFrame == null) {
                    return this.idata.isStrict;
                }
                this = callFrame;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$equals$0(Object obj, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            return equalsInTopScope(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Boolean lambda$equalsInTopScope$1(Object obj, EqualObjectGraphs equalObjectGraphs) {
            return equals(this, (CallFrame) obj, equalObjectGraphs);
        }

        public CallFrame cloneFrozen() {
            if (!this.frozen) {
                Kit.codeBug();
            }
            try {
                CallFrame callFrame = (CallFrame) clone();
                callFrame.stack = (Object[]) this.stack.clone();
                callFrame.stackAttributes = (int[]) this.stackAttributes.clone();
                callFrame.sDbl = (double[]) this.sDbl.clone();
                callFrame.frozen = false;
                return callFrame;
            } catch (CloneNotSupportedException unused) {
                vm1.d();
                return null;
            }
        }

        public Object[] ensureStackLength(int i) {
            Object[] objArr = this.stack;
            if (i > objArr.length) {
                this.stack = Arrays.copyOf(objArr, i);
                this.sDbl = Arrays.copyOf(this.sDbl, i);
            }
            return this.stack;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CallFrame)) {
                return false;
            }
            Context enter = Context.enter();
            try {
                if (ScriptRuntime.hasTopCall(enter)) {
                    boolean booleanValue = equalsInTopScope(obj).booleanValue();
                    if (enter != null) {
                        enter.close();
                    }
                    return booleanValue;
                }
                Scriptable topLevelScope = ScriptableObject.getTopLevelScope(this.scope);
                boolean booleanValue2 = ((Boolean) ScriptRuntime.doTopCall(new e(0, this, obj), enter, topLevelScope, topLevelScope, ScriptRuntime.emptyArgs, isStrictTopFrame())).booleanValue();
                if (enter != null) {
                    enter.close();
                }
                return booleanValue2;
            } catch (Throwable th) {
                if (enter != null) {
                    try {
                        enter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public int hashCode() {
            int i = 0;
            int i2 = 0;
            while (true) {
                i = (((i * 31) + this.pc) * 31) + this.idata.icodeHashCode();
                this = this.parentFrame;
                if (this == null) {
                    break;
                }
                int i3 = i2 + 1;
                if (i2 >= 8) {
                    break;
                }
                i2 = i3;
            }
            return i;
        }

        public void initializeArgs(Context context, Scriptable scriptable, Object[] objArr, double[] dArr, int i, int i2, Scriptable scriptable2) {
            Object[] objArr2;
            double[] dArr2;
            int i3;
            InterpreterData interpreterData;
            InterpreterData interpreterData2;
            Object[] objArr3;
            if (this.useActivation) {
                if (dArr != null) {
                    objArr = Interpreter.getArgsArray(objArr, dArr, i, i2);
                }
                dArr2 = null;
                objArr2 = objArr;
                i3 = 0;
            } else {
                objArr2 = objArr;
                dArr2 = dArr;
                i3 = i;
            }
            if (this.idata.itsFunctionType != 0) {
                Scriptable parentScope = this.fnOrScript.getParentScope();
                this.scope = parentScope;
                if (this.useActivation) {
                    InterpreterData interpreterData3 = this.idata;
                    int i4 = interpreterData3.itsFunctionType;
                    InterpretedFunction interpretedFunction = this.fnOrScript;
                    boolean z = interpreterData3.isStrict;
                    if (i4 == 4) {
                        this.scope = ScriptRuntime.createArrowFunctionActivation(interpretedFunction, context, parentScope, objArr2, z, interpreterData3.argsHasRest, scriptable2);
                    } else {
                        this.scope = ScriptRuntime.createFunctionActivation(interpretedFunction, context, parentScope, objArr2, z, interpreterData3.argsHasRest, scriptable2);
                    }
                }
            } else {
                this.scope = scriptable;
                InterpretedFunction interpretedFunction2 = this.fnOrScript;
                ScriptRuntime.initScript(interpretedFunction2, this.thisObj, context, scriptable, interpretedFunction2.idata.evalScriptFlag);
            }
            InterpreterData interpreterData4 = this.idata;
            if (interpreterData4.itsNestedFunctions != null) {
                if (interpreterData4.itsFunctionType != 0 && !interpreterData4.itsNeedsActivation) {
                    Kit.codeBug();
                }
                int i5 = 0;
                while (true) {
                    InterpreterData[] interpreterDataArr = this.idata.itsNestedFunctions;
                    if (i5 >= interpreterDataArr.length) {
                        break;
                    }
                    if (interpreterDataArr[i5].itsFunctionType == 1) {
                        Interpreter.initFunction(context, this.scope, this.fnOrScript, i5);
                    }
                    i5++;
                }
            }
            InterpreterData interpreterData5 = this.idata;
            int i6 = interpreterData5.itsMaxFrameArray;
            if (i6 != this.emptyStackTop + interpreterData5.itsMaxStack + 1) {
                Kit.codeBug();
            }
            this.stack = new Object[i6];
            this.stackAttributes = new int[i6];
            this.sDbl = new double[i6];
            int paramAndVarCount = this.idata.getParamAndVarCount();
            int i7 = 0;
            while (true) {
                interpreterData = this.idata;
                if (i7 >= paramAndVarCount) {
                    break;
                }
                if (interpreterData.getParamOrVarConst(i7)) {
                    this.stackAttributes[i7] = 13;
                }
                i7++;
            }
            int i8 = interpreterData.argCount;
            if (i8 > i2) {
                i8 = i2;
            }
            System.arraycopy(objArr2, i3, this.stack, 0, i8);
            if (dArr2 != null) {
                System.arraycopy(dArr2, i3, this.sDbl, 0, i8);
            }
            while (true) {
                interpreterData2 = this.idata;
                if (i8 == interpreterData2.itsMaxVars) {
                    break;
                }
                this.stack[i8] = Undefined.instance;
                i8++;
            }
            if (interpreterData2.argsHasRest) {
                int i9 = interpreterData2.argCount;
                int i10 = i9 - 1;
                if (i2 >= i9) {
                    int i11 = i2 - i10;
                    objArr3 = new Object[i11];
                    int i12 = i3 + i10;
                    for (int i13 = 0; i13 != i11; i13++) {
                        Object obj = objArr2[i12];
                        if (obj == UniqueTag.DOUBLE_MARK) {
                            obj = ScriptRuntime.wrapNumber(dArr2[i12]);
                        }
                        objArr3[i13] = obj;
                        i12++;
                    }
                } else {
                    objArr3 = ScriptRuntime.emptyArgs;
                }
                this.stack[i10] = context.newArray(this.scope, objArr3);
            }
        }

        private static Boolean equals(CallFrame callFrame, CallFrame callFrame2, EqualObjectGraphs equalObjectGraphs) {
            while (callFrame != callFrame2) {
                if (callFrame != null && callFrame2 != null) {
                    if (!callFrame.fieldsEqual(callFrame2, equalObjectGraphs)) {
                        return Boolean.FALSE;
                    }
                    callFrame = callFrame.parentFrame;
                    callFrame2 = callFrame2.parentFrame;
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
    }

    public static NativeContinuation captureContinuation(Context context) {
        Object obj = context.lastInterpreterFrame;
        if (obj != null && (obj instanceof CallFrame)) {
            return captureContinuation(context, (CallFrame) obj, true);
        }
        vs.k("Interpreter frames not found");
        return null;
    }
}
