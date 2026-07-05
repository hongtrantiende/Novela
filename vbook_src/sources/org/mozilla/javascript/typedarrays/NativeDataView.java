package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeDataView extends NativeArrayBufferView {
    public static final String CLASS_NAME = "DataView";
    private static final long serialVersionUID = 1427967607557438968L;

    public NativeDataView() {
    }

    private static int determinePos(Object[] objArr) {
        if (!NativeArrayBufferView.isArg(objArr, 0)) {
            return 0;
        }
        double number = ScriptRuntime.toNumber(objArr[0]);
        if (!Double.isInfinite(number)) {
            return ScriptRuntime.toInt32(number);
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 1, 2, new zx7(1));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        lambdaConstructor.definePrototypeProperty(context, "buffer", new f1(4), 3);
        lambdaConstructor.definePrototypeProperty(context, "byteLength", new f1(5), 3);
        lambdaConstructor.definePrototypeProperty(context, "byteOffset", new f1(6), 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getFloat32", 1, new ay7(2), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getFloat64", 1, new ay7(3), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getInt8", 1, new ay7(4), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getInt16", 1, new ay7(5), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getInt32", 1, new ay7(6), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getUint8", 1, new ay7(7), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getUint16", 1, new ay7(8), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getUint32", 1, new ay7(9), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setFloat32", 2, new ay7(10), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setFloat64", 2, new ay7(11), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setInt8", 2, new ay7(12), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setInt16", 2, new ay7(13), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setInt32", 2, new ay7(14), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setUint8", 2, new ay7(15), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setUint16", 2, new ay7(16), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setUint32", 2, new ay7(1), 2, 3);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    public static NativeDataView js_constructor(Context context, Scriptable scriptable, Object[] objArr) {
        int length;
        int i = 0;
        if (NativeArrayBufferView.isArg(objArr, 0)) {
            Object obj = objArr[0];
            if (obj instanceof NativeArrayBuffer) {
                NativeArrayBuffer nativeArrayBuffer = (NativeArrayBuffer) obj;
                if (NativeArrayBufferView.isArg(objArr, 1)) {
                    double number = ScriptRuntime.toNumber(objArr[1]);
                    if (!Double.isInfinite(number)) {
                        i = ScriptRuntime.toInt32(number);
                    } else {
                        throw ScriptRuntime.rangeError("offset out of range");
                    }
                }
                if (NativeArrayBufferView.isArg(objArr, 2)) {
                    double number2 = ScriptRuntime.toNumber(objArr[2]);
                    if (!Double.isInfinite(number2)) {
                        length = ScriptRuntime.toInt32(number2);
                    } else {
                        throw ScriptRuntime.rangeError("offset out of range");
                    }
                } else {
                    length = nativeArrayBuffer.getLength() - i;
                }
                if (length >= 0) {
                    if (i >= 0 && i + length <= nativeArrayBuffer.getLength()) {
                        return new NativeDataView(nativeArrayBuffer, i, length);
                    }
                    throw ScriptRuntime.rangeError("offset out of range");
                }
                throw ScriptRuntime.rangeError("length out of range");
            }
        }
        throw ScriptRuntime.constructError("TypeError", "Missing parameters");
    }

    private Object js_getFloat(int i, Object[] objArr) {
        int determinePos = determinePos(objArr);
        rangeCheck(determinePos, i);
        boolean z = true;
        z = (NativeArrayBufferView.isArg(objArr, 1) && i > 1 && ScriptRuntime.toBoolean(objArr[1])) ? false : false;
        if (i != 4) {
            if (i == 8) {
                return ByteIo.readFloat64(this.arrayBuffer.buffer, this.offset + determinePos, z);
            }
            cp8.i();
            return null;
        }
        return ByteIo.readFloat32(this.arrayBuffer.buffer, this.offset + determinePos, z);
    }

    private Object js_getInt(int i, boolean z, Object[] objArr) {
        boolean z2;
        int determinePos = determinePos(objArr);
        rangeCheck(determinePos, i);
        if (NativeArrayBufferView.isArg(objArr, 1) && i > 1 && ScriptRuntime.toBoolean(objArr[1])) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    NativeArrayBuffer nativeArrayBuffer = this.arrayBuffer;
                    if (z) {
                        return ByteIo.readInt32(nativeArrayBuffer.buffer, this.offset + determinePos, z2);
                    }
                    return ByteIo.readUint32(nativeArrayBuffer.buffer, this.offset + determinePos, z2);
                }
                cp8.i();
                return null;
            }
            NativeArrayBuffer nativeArrayBuffer2 = this.arrayBuffer;
            if (z) {
                return ByteIo.readInt16(nativeArrayBuffer2.buffer, this.offset + determinePos, z2);
            }
            return ByteIo.readUint16(nativeArrayBuffer2.buffer, this.offset + determinePos, z2);
        }
        NativeArrayBuffer nativeArrayBuffer3 = this.arrayBuffer;
        if (z) {
            return ByteIo.readInt8(nativeArrayBuffer3.buffer, this.offset + determinePos);
        }
        return ByteIo.readUint8(nativeArrayBuffer3.buffer, this.offset + determinePos);
    }

    private void js_setFloat(int i, Object[] objArr) {
        boolean z;
        double d;
        int determinePos = determinePos(objArr);
        if (determinePos >= 0) {
            if (NativeArrayBufferView.isArg(objArr, 2) && i > 1 && ScriptRuntime.toBoolean(objArr[2])) {
                z = true;
            } else {
                z = false;
            }
            if (objArr.length > 1) {
                d = ScriptRuntime.toNumber(objArr[1]);
            } else {
                d = Double.NaN;
            }
            if (determinePos + i <= this.byteLength) {
                if (i != 4) {
                    if (i == 8) {
                        ByteIo.writeFloat64(this.arrayBuffer.buffer, this.offset + determinePos, d, z);
                        return;
                    } else {
                        cp8.i();
                        return;
                    }
                }
                ByteIo.writeFloat32(this.arrayBuffer.buffer, this.offset + determinePos, d, z);
                return;
            }
            throw ScriptRuntime.rangeError("offset out of range");
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    private void js_setInt(int i, boolean z, Object[] objArr) {
        boolean z2;
        int determinePos = determinePos(objArr);
        if (determinePos >= 0) {
            if (NativeArrayBufferView.isArg(objArr, 2) && i > 1 && ScriptRuntime.toBoolean(objArr[2])) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj = ScriptRuntime.zeroObj;
            if (objArr.length > 1) {
                obj = objArr[1];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        if (z) {
                            int int32 = Conversions.toInt32(obj);
                            if (i + determinePos <= this.byteLength) {
                                ByteIo.writeInt32(this.arrayBuffer.buffer, this.offset + determinePos, int32, z2);
                                return;
                            }
                            throw ScriptRuntime.rangeError("offset out of range");
                        }
                        long uint32 = Conversions.toUint32(obj);
                        if (i + determinePos <= this.byteLength) {
                            ByteIo.writeUint32(this.arrayBuffer.buffer, this.offset + determinePos, uint32, z2);
                            return;
                        }
                        throw ScriptRuntime.rangeError("offset out of range");
                    }
                    cp8.i();
                    return;
                } else if (z) {
                    int int16 = Conversions.toInt16(obj);
                    if (i + determinePos <= this.byteLength) {
                        ByteIo.writeInt16(this.arrayBuffer.buffer, this.offset + determinePos, int16, z2);
                        return;
                    }
                    throw ScriptRuntime.rangeError("offset out of range");
                } else {
                    int uint16 = Conversions.toUint16(obj);
                    if (i + determinePos <= this.byteLength) {
                        ByteIo.writeUint16(this.arrayBuffer.buffer, this.offset + determinePos, uint16, z2);
                        return;
                    }
                    throw ScriptRuntime.rangeError("offset out of range");
                }
            } else if (z) {
                int int8 = Conversions.toInt8(obj);
                if (i + determinePos <= this.byteLength) {
                    ByteIo.writeInt8(this.arrayBuffer.buffer, this.offset + determinePos, int8);
                    return;
                }
                throw ScriptRuntime.rangeError("offset out of range");
            } else {
                int uint8 = Conversions.toUint8(obj);
                if (i + determinePos <= this.byteLength) {
                    ByteIo.writeUint8(this.arrayBuffer.buffer, this.offset + determinePos, uint8);
                    return;
                }
                throw ScriptRuntime.rangeError("offset out of range");
            }
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    public static /* synthetic */ Object lambda$init$0(Scriptable scriptable) {
        return realThis(scriptable).arrayBuffer;
    }

    public static /* synthetic */ Object lambda$init$1(Scriptable scriptable) {
        return Integer.valueOf(realThis(scriptable).byteLength);
    }

    public static /* synthetic */ Object lambda$init$10(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(4, false, objArr);
    }

    public static /* synthetic */ Object lambda$init$11(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setFloat(4, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$12(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setFloat(8, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$13(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(1, true, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$14(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(2, true, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$15(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(4, true, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$16(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(1, false, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$17(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(2, false, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$18(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(4, false, objArr);
        return Undefined.instance;
    }

    public static /* synthetic */ Object lambda$init$2(Scriptable scriptable) {
        return Integer.valueOf(realThis(scriptable).offset);
    }

    public static /* synthetic */ Object lambda$init$3(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getFloat(4, objArr);
    }

    public static /* synthetic */ Object lambda$init$4(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getFloat(8, objArr);
    }

    public static /* synthetic */ Object lambda$init$5(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(1, true, objArr);
    }

    public static /* synthetic */ Object lambda$init$6(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(2, true, objArr);
    }

    public static /* synthetic */ Object lambda$init$7(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(4, true, objArr);
    }

    public static /* synthetic */ Object lambda$init$8(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(1, false, objArr);
    }

    public static /* synthetic */ Object lambda$init$9(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(2, false, objArr);
    }

    private void rangeCheck(int i, int i2) {
        if (i >= 0 && i + i2 <= this.byteLength) {
            return;
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    private static NativeDataView realThis(Scriptable scriptable) {
        return (NativeDataView) LambdaConstructor.convertThisObject(scriptable, NativeDataView.class);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    public NativeDataView(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        super(nativeArrayBuffer, i, i2);
    }
}
