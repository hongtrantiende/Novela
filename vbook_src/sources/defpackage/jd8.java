package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jd8  reason: default package */
/* loaded from: classes.dex */
public final class jd8 extends pe8 {
    public static final jd8 c = new pe8(0, 2, 1);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        int i = ((wy5) vh1Var.d(0)).a;
        List list = (List) vh1Var.d(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            nyVar.c(i3, obj);
            nyVar.p(i3, obj);
        }
    }
}
