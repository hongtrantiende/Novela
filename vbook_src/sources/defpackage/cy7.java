package defpackage;

import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cy7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy7 implements NativeTypedArrayView.TypedArrayConstructable, NativeTypedArrayView.RealThis, u94, fz2 {
    public final /* synthetic */ int a;

    public /* synthetic */ cy7(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj + ((Object) " is not supported!"));
    }

    public static /* synthetic */ void k(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u94
    public r94[] b() {
        return new r94[]{new Object()};
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.TypedArrayConstructable
    public NativeTypedArrayView construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        switch (this.a) {
            case 0:
                return new NativeFloat64Array(nativeArrayBuffer, i, i2);
            case 1:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            default:
                return new NativeUint8ClampedArray(nativeArrayBuffer, i, i2);
            case 2:
                return new NativeInt16Array(nativeArrayBuffer, i, i2);
            case 4:
                return new NativeInt32Array(nativeArrayBuffer, i, i2);
            case 7:
                return new NativeInt8Array(nativeArrayBuffer, i, i2);
            case 9:
                return new NativeUint16Array(nativeArrayBuffer, i, i2);
            case 11:
                return new NativeUint32Array(nativeArrayBuffer, i, i2);
            case 12:
                return new NativeUint8Array(nativeArrayBuffer, i, i2);
        }
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis
    public NativeTypedArrayView realThis(Scriptable scriptable) {
        NativeFloat64Array realThis;
        NativeInt16Array realThis2;
        NativeInt32Array realThis3;
        NativeInt8Array realThis4;
        NativeUint16Array realThis5;
        NativeUint32Array realThis6;
        NativeUint8Array realThis7;
        NativeUint8ClampedArray realThis8;
        switch (this.a) {
            case 1:
                realThis = NativeFloat64Array.realThis(scriptable);
                return realThis;
            case 2:
            case 4:
            case 7:
            case 9:
            case 11:
            case 12:
            default:
                realThis8 = NativeUint8ClampedArray.realThis(scriptable);
                return realThis8;
            case 3:
                realThis2 = NativeInt16Array.realThis(scriptable);
                return realThis2;
            case 5:
                realThis3 = NativeInt32Array.realThis(scriptable);
                return realThis3;
            case 6:
                realThis4 = NativeInt8Array.realThis(scriptable);
                return realThis4;
            case 8:
                realThis5 = NativeUint16Array.realThis(scriptable);
                return realThis5;
            case 10:
                realThis6 = NativeUint32Array.realThis(scriptable);
                return realThis6;
            case 13:
                realThis7 = NativeUint8Array.realThis(scriptable);
                return realThis7;
        }
    }

    @Override // defpackage.fz2
    public void f(l99 l99Var) {
    }
}
