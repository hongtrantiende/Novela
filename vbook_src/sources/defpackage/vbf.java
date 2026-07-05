package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vbf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vbf implements c10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b7f b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ vbf(b7f b7fVar, int i, ArrayList arrayList) {
        this.b = b7fVar;
        this.d = i;
        this.c = arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.c10
    public final ListenableFuture apply(Object obj) {
        int i = this.a;
        int i2 = this.d;
        ArrayList arrayList = this.c;
        b7f b7fVar = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) dv4.b((Future) arrayList.get(i3))).booleanValue()) {
                        ((List) b7fVar.b).get(i3).getClass();
                        vm1.h();
                        return null;
                    }
                }
                qs5 k = qs5.k(arrayList2);
                ?? obj2 = new Object();
                lo1 lo1Var = new lo1(k, true);
                lo1Var.J = new ko1(lo1Var, (Callable) obj2);
                lo1Var.s();
                return lo1Var;
            default:
                lo1 lo1Var2 = new lo1(qs5.k(arrayList), false);
                lo1Var2.J = new ko1(lo1Var2, khf.a(new elf(b7fVar, (hzd) obj, i2, arrayList)), (Executor) b7fVar.c);
                lo1Var2.s();
                return lo1Var2;
        }
    }

    public /* synthetic */ vbf(b7f b7fVar, ArrayList arrayList, int i) {
        this.b = b7fVar;
        this.c = arrayList;
        this.d = i;
    }
}
