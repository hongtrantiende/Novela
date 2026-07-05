package defpackage;

import android.content.res.Resources;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ig  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ig extends xu4 implements mu4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        switch (i3) {
            case 0:
                if (obj == null) {
                    rg rgVar = (rg) this.receiver;
                    Resources resources = rgVar.getContext().getResources();
                    return Boolean.valueOf(zg.a.a(rgVar, null, new aw1(new u13(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((dna) obj2).a, (xt4) obj3)));
                }
                vm1.h();
                return null;
            case 1:
                Throwable th = (Throwable) obj;
                xt4 xt4Var = ((xy0) this.receiver).b;
                xt4Var.getClass();
                que.p(xt4Var, obj2, (d82) obj3);
                return pvcVar;
            case 2:
                Throwable th2 = (Throwable) obj;
                Object obj4 = ((jb1) obj2).a;
                xt4 xt4Var2 = ((xy0) this.receiver).b;
                xt4Var2.getClass();
                Object a = jb1.a(obj4);
                a.getClass();
                que.p(xt4Var2, a, (d82) obj3);
                return pvcVar;
            default:
                f24 f24Var = (f24) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                f24Var.getClass();
                str.getClass();
                str2.getClass();
                p24 p24Var = (p24) this.receiver;
                p24Var.getClass();
                cza czaVar = p24Var.C;
                int i4 = ((n24) czaVar.getValue()).o;
                if (i4 < 1) {
                    i4 = 1;
                }
                Integer R = r4b.R(10, str);
                if (R != null) {
                    i = R.intValue();
                } else {
                    i = 1;
                }
                int n = dce.n(i, 1, i4);
                Integer R2 = r4b.R(10, str2);
                if (R2 != null) {
                    i2 = R2.intValue();
                } else {
                    i2 = n;
                }
                int n2 = dce.n(i2, n, i4);
                if (czaVar != null) {
                    while (true) {
                        Object value = czaVar.getValue();
                        int i5 = n;
                        if (!czaVar.l(value, n24.a((n24) value, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, f24Var, String.valueOf(n), String.valueOf(n2), false, false, false, false, false, false, null, null, null, 1071906815))) {
                            n = i5;
                        }
                    }
                }
                return pvcVar;
        }
    }
}
