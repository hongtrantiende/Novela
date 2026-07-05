package defpackage;

import android.view.KeyEvent;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oj7  reason: default package */
/* loaded from: classes3.dex */
public final class oj7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oj7(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int size;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return ((si7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                return ((si7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                int intValue = ((Number) obj).intValue();
                return ((j35) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 3:
                return ((bo7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((bo7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                return ((bo7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                return ((bo7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 7:
                KeyEvent keyEvent = ((g86) obj).a;
                keyEvent.getClass();
                ud0 ud0Var = (ud0) obj3;
                hm8 hm8Var = ud0Var.c;
                hm8 hm8Var2 = ud0Var.a;
                hm8 hm8Var3 = ud0Var.c;
                boolean booleanValue = ((Boolean) hm8Var.getValue()).booleanValue();
                em8 em8Var = ud0Var.b;
                boolean z = false;
                if (booleanValue && gae.j(keyEvent) == 2) {
                    long a = rae.a(keyEvent.getKeyCode());
                    if (e86.a(a, e86.f)) {
                        if (!ud0Var.a().isEmpty()) {
                            em8Var.i((em8Var.h() + 1) % ud0Var.a().size());
                        }
                    } else if (e86.a(a, e86.e)) {
                        if (!ud0Var.a().isEmpty()) {
                            if (em8Var.h() > 0) {
                                size = em8Var.h();
                            } else {
                                size = ud0Var.a().size();
                            }
                            em8Var.i(size - 1);
                        }
                    } else {
                        boolean a2 = e86.a(a, e86.v);
                        ks3 ks3Var = ks3.a;
                        if (!a2 && !e86.a(a, e86.x)) {
                            if (e86.a(a, e86.A)) {
                                hm8Var3.setValue(Boolean.FALSE);
                                hm8Var2.setValue(ks3Var);
                                em8Var.i(0);
                            }
                        } else {
                            ht1 ht1Var = (ht1) sl1.f0(em8Var.h(), ud0Var.a());
                            if (ht1Var != null) {
                                ((sk1) obj2).c(ht1Var.c);
                                ud0Var.d.getClass();
                                ud0Var.e = new u9c(yq7.a());
                                hm8Var3.setValue(Boolean.FALSE);
                                hm8Var2.setValue(ks3Var);
                                em8Var.i(0);
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                int intValue2 = ((Number) obj).intValue();
                return ((j35) obj3).invoke(Integer.valueOf(intValue2), ((List) obj2).get(intValue2));
            case 9:
                int intValue3 = ((Number) obj).intValue();
                return ((j35) obj3).invoke(Integer.valueOf(intValue3), ((List) obj2).get(intValue3));
            case 10:
                return ((rg8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 11:
                int intValue4 = ((Number) obj).intValue();
                return ((j35) obj3).invoke(Integer.valueOf(intValue4), ((List) obj2).get(intValue4));
            case 12:
                int intValue5 = ((Number) obj).intValue();
                return ((mx8) obj3).invoke(Integer.valueOf(intValue5), ((List) obj2).get(intValue5));
            case 13:
                int intValue6 = ((Number) obj).intValue();
                return ((mx8) obj3).invoke(Integer.valueOf(intValue6), ((List) obj2).get(intValue6));
            case 14:
                int intValue7 = ((Number) obj).intValue();
                return ((mx8) obj3).invoke(Integer.valueOf(intValue7), ((List) obj2).get(intValue7));
            case 15:
                int intValue8 = ((Number) obj).intValue();
                return ((mx8) obj3).invoke(Integer.valueOf(intValue8), ((List) obj2).get(intValue8));
            case 16:
                return ((gda) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((gda) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 18:
                return ((gda) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 19:
                ((gda) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list1";
            case 20:
                return ((gda) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 21:
                ((gda) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list2";
            case 22:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "grid1";
            case 24:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 25:
                ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "grid2";
            case 26:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 27:
                ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list1";
            case 28:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list2";
        }
    }
}
