package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr8  reason: default package */
/* loaded from: classes3.dex */
public final class gr8 extends aab implements lu4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public int a;
    public final /* synthetic */ lu4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ z09 d;
    public final /* synthetic */ sk8 e;
    public final /* synthetic */ xt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr8(lu4 lu4Var, int i, z09 z09Var, sk8 sk8Var, xt4 xt4Var, float f, float f2, m42 m42Var) {
        super(2, m42Var);
        this.b = lu4Var;
        this.c = i;
        this.d = z09Var;
        this.e = sk8Var;
        this.f = xt4Var;
        this.C = f;
        this.D = f2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new gr8(this.b, this.c, this.d, this.e, this.f, this.C, this.D, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((gr8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ry5 ry5Var;
        ?? r8;
        int i = this.a;
        ry5 ry5Var2 = null;
        int i2 = this.c;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            Integer num = new Integer(i2);
            this.a = 1;
            obj = this.b.invoke(num, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        rq8 rq8Var = (rq8) obj;
        boolean isEmpty = rq8Var.a.isEmpty();
        pvc pvcVar = pvc.a;
        if (!isEmpty) {
            long j = this.d.c;
            float f = this.C;
            float f2 = this.D;
            long a = jr8.a(f, f2, j);
            Integer a2 = rq8Var.a(Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (a & 4294967295L)));
            if (a2 != null) {
                int intValue = a2.intValue();
                ArrayList arrayList = rq8Var.a;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj2 = arrayList.get(i3);
                        i3++;
                        qq8 qq8Var = (qq8) obj2;
                        if (intValue >= qq8Var.a && intValue <= qq8Var.b) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                qq8 qq8Var2 = (qq8) obj2;
                if (qq8Var2 == null) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r8 = listIterator.previous();
                            if (intValue >= ((qq8) r8).a) {
                                break;
                            }
                        } else {
                            r8 = 0;
                            break;
                        }
                    }
                    qq8Var2 = r8;
                }
                if (qq8Var2 != null) {
                    String str = qq8Var2.c;
                    int i4 = qq8Var2.a;
                    int n = dce.n(intValue - i4, 0, str.length());
                    if (str.length() != 0) {
                        if (n < str.length() && Character.isLetterOrDigit(str.charAt(n))) {
                            int i5 = n;
                            while (i5 > 0 && Character.isLetterOrDigit(str.charAt(i5 - 1))) {
                                i5--;
                            }
                            while (n < str.length() - 1) {
                                int i6 = n + 1;
                                if (!Character.isLetterOrDigit(str.charAt(i6))) {
                                    break;
                                }
                                n = i6;
                            }
                            ry5Var = new ry5(i5 + i4, i4 + n + 1, 1);
                        } else {
                            int i7 = n - 1;
                            while (i7 >= 0 && !Character.isLetterOrDigit(str.charAt(i7))) {
                                i7--;
                            }
                            if (i7 < 0) {
                                ry5Var2 = new ry5(i4, qq8Var2.b, 1);
                            } else {
                                int i8 = i7;
                                while (i8 > 0 && Character.isLetterOrDigit(str.charAt(i8 - 1))) {
                                    i8--;
                                }
                                ry5Var = new ry5(i8 + i4, i4 + i7 + 1, 1);
                            }
                        }
                        ry5Var2 = ry5Var;
                    }
                }
                if (ry5Var2 == null) {
                    ry5Var2 = new ry5(intValue, intValue, 1);
                }
                int i9 = ry5Var2.a;
                ry5 ry5Var3 = new ry5(i9, ry5Var2.b, 1);
                sk8 sk8Var = this.e;
                ((hm8) sk8Var.a).setValue(Integer.valueOf(i2));
                ((hm8) sk8Var.b).setValue(rq8Var);
                ((hm8) sk8Var.c).setValue(Integer.valueOf(i9));
                ((hm8) sk8Var.d).setValue(Integer.valueOf(ry5Var3.b));
                ((hm8) sk8Var.f).setValue(ks3.a);
                ((hm8) sk8Var.g).setValue(-1);
                ((hm8) sk8Var.h).setValue(-1);
                this.f.invoke(eze.d(sk8Var, f, f2));
            }
        }
        return pvcVar;
    }
}
