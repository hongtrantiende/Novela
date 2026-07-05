package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p35  reason: default package */
/* loaded from: classes.dex */
public final class p35 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public p35(Looper looper) {
        this.a = 0;
        this.b = new ovd(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ovd) obj).post(runnable);
                return;
            case 1:
                ((Executor) obj).execute(new uw9(runnable, 0));
                return;
            case 2:
                ((omd) obj).c.post(runnable);
                return;
            default:
                ete eteVar = ((lte) ((yze) obj).a).C;
                lte.m(eteVar);
                eteVar.g0(runnable);
                return;
        }
    }

    public /* synthetic */ p35(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
