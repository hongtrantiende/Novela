package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeArrayBuffer extends ScriptableObject {
    public static final String CLASS_NAME = "ArrayBuffer";
    private static final byte[] EMPTY_BUF = new byte[0];
    private static final long serialVersionUID = 3110411773054879549L;
    final byte[] buffer;

    public NativeArrayBuffer(double d) {
        if (d < 2.147483647E9d) {
            if (d != Double.NEGATIVE_INFINITY) {
                if (d > -1.0d) {
                    int int32 = ScriptRuntime.toInt32(d);
                    if (int32 >= 0) {
                        if (int32 == 0) {
                            this.buffer = EMPTY_BUF;
                            return;
                        } else {
                            this.buffer = new byte[int32];
                            return;
                        }
                    }
                    throw ScriptRuntime.rangeError("Negative array length " + d);
                }
                throw ScriptRuntime.rangeError("Negative array length " + d);
            }
            throw ScriptRuntime.rangeError("Negative array length " + d);
        }
        throw ScriptRuntime.rangeError("length parameter (" + d + ") is too large ");
    }

    private static NativeArrayBuffer getSelf(Scriptable scriptable) {
        return (NativeArrayBuffer) LambdaConstructor.convertThisObject(scriptable, NativeArrayBuffer.class);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 1, 2, new zx7(0));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        lambdaConstructor.defineConstructorMethod(scriptable, "isView", 1, new ay7(0), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "slice", 2, new by7(lambdaConstructor, 0), 2, 3);
        lambdaConstructor.definePrototypeProperty(context, "byteLength", new f1(2), 3);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    private static boolean isArg(Object[] objArr, int i) {
        if (objArr.length > i && !Undefined.instance.equals(objArr[i])) {
            return true;
        }
        return false;
    }

    public static Object js_byteLength(Scriptable scriptable) {
        return Integer.valueOf(getSelf(scriptable).getLength());
    }

    public static NativeArrayBuffer js_constructor(Context context, Scriptable scriptable, Object[] objArr) {
        double d;
        if (isArg(objArr, 0)) {
            d = ScriptRuntime.toNumber(objArr[0]);
        } else {
            d = 0.0d;
        }
        return new NativeArrayBuffer(d);
    }

    public static Boolean js_isView(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        boolean z = false;
        if (isArg(objArr, 0) && (objArr[0] instanceof NativeArrayBufferView)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static NativeArrayBuffer js_slice(Context context, Scriptable scriptable, Scriptable scriptable2, LambdaConstructor lambdaConstructor, Object[] objArr) {
        double d;
        double length;
        NativeArrayBuffer self = getSelf(scriptable2);
        if (isArg(objArr, 0)) {
            d = ScriptRuntime.toNumber(objArr[0]);
        } else {
            d = 0.0d;
        }
        if (isArg(objArr, 1)) {
            length = ScriptRuntime.toNumber(objArr[1]);
        } else {
            length = self.getLength();
        }
        double length2 = self.getLength();
        if (length < 0.0d) {
            length += self.getLength();
        }
        int int32 = ScriptRuntime.toInt32(Math.max(0.0d, Math.min(length2, length)));
        double d2 = int32;
        if (d < 0.0d) {
            d += self.getLength();
        }
        int int322 = ScriptRuntime.toInt32(Math.min(d2, Math.max(0.0d, d)));
        int i = int32 - int322;
        Scriptable construct = AbstractEcmaObjectOperations.speciesConstructor(context, scriptable2, lambdaConstructor).construct(context, scriptable, new Object[]{Integer.valueOf(i)});
        if (construct instanceof NativeArrayBuffer) {
            NativeArrayBuffer nativeArrayBuffer = (NativeArrayBuffer) construct;
            if (nativeArrayBuffer != self) {
                int length3 = nativeArrayBuffer.getLength();
                if (length3 >= i) {
                    System.arraycopy(self.buffer, int322, nativeArrayBuffer.buffer, 0, i);
                    return nativeArrayBuffer;
                }
                throw ScriptRuntime.typeErrorById("msg.arraybuf.smaller.len", Integer.valueOf(i), Integer.valueOf(length3));
            }
            throw ScriptRuntime.typeErrorById("msg.arraybuf.same", new Object[0]);
        }
        throw ScriptRuntime.typeErrorById("msg.species.invalid.ctor", new Object[0]);
    }

    public static /* synthetic */ Object lambda$init$0(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_slice(context, scriptable, scriptable2, lambdaConstructor, objArr);
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    public int getLength() {
        return this.buffer.length;
    }

    public NativeArrayBuffer slice(double d, double d2) {
        byte[] bArr;
        double length = this.buffer.length;
        if (d2 < 0.0d) {
            d2 += bArr.length;
        }
        int int32 = ScriptRuntime.toInt32(Math.max(0.0d, Math.min(length, d2)));
        double d3 = int32;
        if (d < 0.0d) {
            d += this.buffer.length;
        }
        int int322 = ScriptRuntime.toInt32(Math.min(d3, Math.max(0.0d, d)));
        int i = int32 - int322;
        NativeArrayBuffer nativeArrayBuffer = new NativeArrayBuffer(i);
        System.arraycopy(this.buffer, int322, nativeArrayBuffer.buffer, 0, i);
        return nativeArrayBuffer;
    }

    public NativeArrayBuffer() {
        this.buffer = EMPTY_BUF;
    }
}
