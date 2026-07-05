package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ky7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Scriptable b;
    public final /* synthetic */ Callable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ky7(Scriptable scriptable, Callable callable, Object obj, int i) {
        this.a = i;
        this.b = scriptable;
        this.c = callable;
        this.d = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object lambda$makeThenFinally$5;
        Object lambda$makeCatchFinally$7;
        switch (this.a) {
            case 0:
                lambda$makeThenFinally$5 = NativePromise.lambda$makeThenFinally$5(this.b, this.c, this.d, context, scriptable, scriptable2, objArr);
                return lambda$makeThenFinally$5;
            default:
                lambda$makeCatchFinally$7 = NativePromise.lambda$makeCatchFinally$7(this.b, this.c, this.d, context, scriptable, scriptable2, objArr);
                return lambda$makeCatchFinally$7;
        }
    }
}
