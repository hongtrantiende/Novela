package defpackage;

import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zx7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx7 implements Constructable {
    public final /* synthetic */ int a;

    public /* synthetic */ zx7(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Constructable
    public final Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        NativeArrayBuffer js_constructor;
        NativeDataView js_constructor2;
        Scriptable lambda$init$0;
        Scriptable constructor;
        NativeSymbol js_constructor3;
        switch (this.a) {
            case 0:
                js_constructor = NativeArrayBuffer.js_constructor(context, scriptable, objArr);
                return js_constructor;
            case 1:
                js_constructor2 = NativeDataView.js_constructor(context, scriptable, objArr);
                return js_constructor2;
            case 2:
                lambda$init$0 = NativeFloat32Array.lambda$init$0(context, scriptable, objArr);
                return lambda$init$0;
            case 3:
                return NativeFloat64Array.W(context, scriptable, objArr);
            case 4:
                return NativeInt16Array.V(context, scriptable, objArr);
            case 5:
                return NativeInt32Array.W(context, scriptable, objArr);
            case 6:
                return NativeInt8Array.V(context, scriptable, objArr);
            case 7:
                constructor = NativePromise.constructor(context, scriptable, objArr);
                return constructor;
            case 8:
                js_constructor3 = NativeSymbol.js_constructor(context, scriptable, objArr);
                return js_constructor3;
            case 9:
                return NativeUint16Array.V(context, scriptable, objArr);
            case 10:
                return NativeUint32Array.W(context, scriptable, objArr);
            case 11:
                return NativeUint8Array.W(context, scriptable, objArr);
            default:
                return NativeUint8ClampedArray.W(context, scriptable, objArr);
        }
    }
}
