package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cu2  reason: default package */
/* loaded from: classes.dex */
public final class cu2 implements k55, l55 {
    public final ze6 a;
    public final Context b;
    public final l99 c;
    public final Set d;
    public final Executor e;

    public cu2(Context context, String str, Set set, l99 l99Var, Executor executor) {
        this.a = new ze6(new pu1(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = l99Var;
        this.b = context;
    }

    public final void a() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!dpe.r(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new bu2(this, 1));
        }
    }
}
