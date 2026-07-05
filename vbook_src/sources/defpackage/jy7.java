package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jy7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object lambda$makeThenFinally$4;
        Object lambda$makeCatchFinally$6;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lambda$makeThenFinally$4 = NativePromise.lambda$makeThenFinally$4(obj, context, scriptable, scriptable2, objArr);
                return lambda$makeThenFinally$4;
            default:
                lambda$makeCatchFinally$6 = NativePromise.lambda$makeCatchFinally$6(obj, context, scriptable, scriptable2, objArr);
                return lambda$makeCatchFinally$6;
        }
    }
}
