package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Function;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaAccessorSlot;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gb6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb6 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gb6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object apply;
        Object lambda$setSetter$1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                apply = ((Function) obj).apply(scriptable2);
                return apply;
            default:
                lambda$setSetter$1 = LambdaAccessorSlot.lambda$setSetter$1((BiConsumer) obj, context, scriptable, scriptable2, objArr);
                return lambda$setSetter$1;
        }
    }
}
