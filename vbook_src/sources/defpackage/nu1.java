package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nu1  reason: default package */
/* loaded from: classes.dex */
public final class nu1 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final mfb f = new mfb(new vt4(this) { // from class: ku1
        public final /* synthetic */ nu1 b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i = r2;
            ks3 ks3Var = ks3.a;
            int i2 = 0;
            nu1 nu1Var = this.b;
            switch (i) {
                case 0:
                    List list = nu1Var.d;
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    while (i2 < size) {
                        xl1.P(arrayList, (List) ((vt4) list.get(i2)).invoke());
                        i2++;
                    }
                    nu1Var.d = ks3Var;
                    return arrayList;
                default:
                    List list2 = nu1Var.e;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = list2.size();
                    while (i2 < size2) {
                        xl1.P(arrayList2, (List) ((vt4) list2.get(i2)).invoke());
                        i2++;
                    }
                    nu1Var.e = ks3Var;
                    return arrayList2;
            }
        }
    });
    public final mfb g = new mfb(new vt4(this) { // from class: ku1
        public final /* synthetic */ nu1 b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i = r2;
            ks3 ks3Var = ks3.a;
            int i2 = 0;
            nu1 nu1Var = this.b;
            switch (i) {
                case 0:
                    List list = nu1Var.d;
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    while (i2 < size) {
                        xl1.P(arrayList, (List) ((vt4) list.get(i2)).invoke());
                        i2++;
                    }
                    nu1Var.d = ks3Var;
                    return arrayList;
                default:
                    List list2 = nu1Var.e;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = list2.size();
                    while (i2 < size2) {
                        xl1.P(arrayList2, (List) ((vt4) list2.get(i2)).invoke());
                        i2++;
                    }
                    nu1Var.e = ks3Var;
                    return arrayList2;
            }
        }
    });

    public nu1(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final Object a(Object obj, xe8 xe8Var) {
        lyc A;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yk8 yk8Var = (yk8) list.get(i);
            yo yoVar = (yo) yk8Var.a;
            if (((gi1) yk8Var.b).h(obj)) {
                yoVar.getClass();
                switch (yoVar.a) {
                    case 0:
                        A = ade.A(((Uri) obj).toString());
                        break;
                    case 1:
                        A = ade.l(((File) obj).getPath());
                        break;
                    case 2:
                        A = ade.l(((hn8) obj).a.t());
                        break;
                    case 3:
                        int intValue = ((Number) obj).intValue();
                        Context context = xe8Var.a;
                        try {
                            if (context.getResources().getResourceEntryName(intValue) != null) {
                                String packageName = context.getPackageName();
                                A = ade.A("android.resource://" + packageName + "/" + intValue);
                                break;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                        A = null;
                        break;
                    default:
                        A = ade.A((String) obj);
                        break;
                }
                if (A != null) {
                    obj = A;
                }
            }
        }
        return obj;
    }

    public final yk8 b(Object obj, xe8 xe8Var, io5 io5Var, int i) {
        mfb mfbVar = this.f;
        int size = ((List) mfbVar.getValue()).size();
        while (i < size) {
            yk8 yk8Var = (yk8) ((List) mfbVar.getValue()).get(i);
            rb4 rb4Var = (rb4) yk8Var.a;
            if (((gi1) yk8Var.b).h(obj)) {
                rb4Var.getClass();
                sb4 a = rb4Var.a(obj, xe8Var, io5Var);
                if (a != null) {
                    return new yk8(a, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }
}
