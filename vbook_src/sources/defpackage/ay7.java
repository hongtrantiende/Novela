package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaMap;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ay7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay7 implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ ay7(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Boolean js_isView;
        Object lambda$init$18;
        Object lambda$init$3;
        Object lambda$init$4;
        Object lambda$init$5;
        Object lambda$init$6;
        Object lambda$init$7;
        Object lambda$init$8;
        Object lambda$init$9;
        Object lambda$init$10;
        Object lambda$init$11;
        Object lambda$init$12;
        Object lambda$init$13;
        Object lambda$init$14;
        Object lambda$init$15;
        Object lambda$init$16;
        Object lambda$init$17;
        Object doCatch;
        Object resolve;
        Object reject;
        Object all;
        Object allSettled;
        Object race;
        Object any;
        Object js_keyFor;
        String js_toString;
        switch (this.a) {
            case 0:
                js_isView = NativeArrayBuffer.js_isView(context, scriptable, scriptable2, objArr);
                return js_isView;
            case 1:
                lambda$init$18 = NativeDataView.lambda$init$18(context, scriptable, scriptable2, objArr);
                return lambda$init$18;
            case 2:
                lambda$init$3 = NativeDataView.lambda$init$3(context, scriptable, scriptable2, objArr);
                return lambda$init$3;
            case 3:
                lambda$init$4 = NativeDataView.lambda$init$4(context, scriptable, scriptable2, objArr);
                return lambda$init$4;
            case 4:
                lambda$init$5 = NativeDataView.lambda$init$5(context, scriptable, scriptable2, objArr);
                return lambda$init$5;
            case 5:
                lambda$init$6 = NativeDataView.lambda$init$6(context, scriptable, scriptable2, objArr);
                return lambda$init$6;
            case 6:
                lambda$init$7 = NativeDataView.lambda$init$7(context, scriptable, scriptable2, objArr);
                return lambda$init$7;
            case 7:
                lambda$init$8 = NativeDataView.lambda$init$8(context, scriptable, scriptable2, objArr);
                return lambda$init$8;
            case 8:
                lambda$init$9 = NativeDataView.lambda$init$9(context, scriptable, scriptable2, objArr);
                return lambda$init$9;
            case 9:
                lambda$init$10 = NativeDataView.lambda$init$10(context, scriptable, scriptable2, objArr);
                return lambda$init$10;
            case 10:
                lambda$init$11 = NativeDataView.lambda$init$11(context, scriptable, scriptable2, objArr);
                return lambda$init$11;
            case 11:
                lambda$init$12 = NativeDataView.lambda$init$12(context, scriptable, scriptable2, objArr);
                return lambda$init$12;
            case 12:
                lambda$init$13 = NativeDataView.lambda$init$13(context, scriptable, scriptable2, objArr);
                return lambda$init$13;
            case 13:
                lambda$init$14 = NativeDataView.lambda$init$14(context, scriptable, scriptable2, objArr);
                return lambda$init$14;
            case 14:
                lambda$init$15 = NativeDataView.lambda$init$15(context, scriptable, scriptable2, objArr);
                return lambda$init$15;
            case 15:
                lambda$init$16 = NativeDataView.lambda$init$16(context, scriptable, scriptable2, objArr);
                return lambda$init$16;
            case 16:
                lambda$init$17 = NativeDataView.lambda$init$17(context, scriptable, scriptable2, objArr);
                return lambda$init$17;
            case 17:
                return NativeJSON.g(context, scriptable, scriptable2, objArr);
            case 18:
                return NativeJSON.h(context, scriptable, scriptable2, objArr);
            case 19:
                return NativeJavaMap.b(context, scriptable, scriptable2, objArr);
            case 20:
                return NativeJavaObject.a(context, scriptable, scriptable2, objArr);
            case 21:
                doCatch = NativePromise.doCatch(context, scriptable, scriptable2, objArr);
                return doCatch;
            case 22:
                resolve = NativePromise.resolve(context, scriptable, scriptable2, objArr);
                return resolve;
            case 23:
                reject = NativePromise.reject(context, scriptable, scriptable2, objArr);
                return reject;
            case 24:
                all = NativePromise.all(context, scriptable, scriptable2, objArr);
                return all;
            case 25:
                allSettled = NativePromise.allSettled(context, scriptable, scriptable2, objArr);
                return allSettled;
            case 26:
                race = NativePromise.race(context, scriptable, scriptable2, objArr);
                return race;
            case 27:
                any = NativePromise.any(context, scriptable, scriptable2, objArr);
                return any;
            case 28:
                js_keyFor = NativeSymbol.js_keyFor(context, scriptable, scriptable2, objArr);
                return js_keyFor;
            default:
                js_toString = NativeSymbol.js_toString(context, scriptable, scriptable2, objArr);
                return js_toString;
        }
    }
}
