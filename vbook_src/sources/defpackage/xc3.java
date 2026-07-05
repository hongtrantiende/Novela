package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xc3  reason: default package */
/* loaded from: classes.dex */
public final class xc3 implements uh6 {
    public final /* synthetic */ yya a;
    public final /* synthetic */ yya b;
    public final /* synthetic */ yya c;
    public final /* synthetic */ float d;
    public final /* synthetic */ dt8 e;

    public xc3(yya yyaVar, yya yyaVar2, yya yyaVar3, float f, dt8 dt8Var) {
        this.a = yyaVar;
        this.b = yyaVar2;
        this.c = yyaVar3;
        this.d = f;
        this.e = dt8Var;
    }

    @Override // defpackage.uh6
    public final c37 a(vh6 vh6Var, long j) {
        long j2;
        List list;
        int h;
        if (!((List) this.a.getValue()).isEmpty()) {
            if (((Boolean) this.b.getValue()).booleanValue()) {
                h = Integer.MAX_VALUE;
            } else {
                h = x02.h(j);
            }
            j2 = j;
            long b = x02.b(j2, 0, 0, 0, h, 2);
            yya yyaVar = this.c;
            jq6 jq6Var = new jq6(((List) yyaVar.getValue()).size());
            List list2 = (List) yyaVar.getValue();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                mi8 mi8Var = (mi8) list2.get(i);
                List<w27> a = vh6Var.a(mi8Var.a);
                ArrayList arrayList = new ArrayList(tl1.s(a, 10));
                for (w27 w27Var : a) {
                    arrayList.add(w27Var.M(b));
                }
                mw8 mw8Var = (mw8) sl1.e0(arrayList);
                if (mw8Var != null) {
                    jq6Var.add(new yk8(mi8Var, mw8Var));
                }
            }
            list = tl1.r(jq6Var);
        } else {
            j2 = j;
            list = ks3.a;
        }
        List list3 = list;
        return vh6Var.q0(x02.i(j2), x02.h(j2), ls3.a, new wc3(j2, this.d, list3, this.e));
    }
}
