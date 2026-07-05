package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yse  reason: default package */
/* loaded from: classes.dex */
public final class yse extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ ete d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yse(ete eteVar, Callable callable, boolean z) {
        super(callable);
        this.d = eteVar;
        long andIncrement = ete.G.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            ppe ppeVar = ((lte) eteVar.a).f;
            lte.m(ppeVar);
            ppeVar.f.e("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yse yseVar = (yse) obj;
        boolean z = yseVar.b;
        boolean z2 = this.b;
        if (z2 != z) {
            if (z2) {
                return -1;
            }
            return 1;
        }
        long j = yseVar.a;
        long j2 = this.a;
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        ppe ppeVar = ((lte) this.d.a).f;
        lte.m(ppeVar);
        ppeVar.C.f(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        ppe ppeVar = ((lte) this.d.a).f;
        lte.m(ppeVar);
        ppeVar.f.f(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yse(ete eteVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = eteVar;
        long andIncrement = ete.G.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            ppe ppeVar = ((lte) eteVar.a).f;
            lte.m(ppeVar);
            ppeVar.f.e("Tasks index overflow");
        }
    }
}
