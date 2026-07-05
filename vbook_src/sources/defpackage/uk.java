package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uk implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ uk(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ef8 a;
        switch (this.a) {
            case 0:
                return c16.l(((f69) obj2).a, ((f69) obj).a);
            case 1:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 2:
                return ((vq4) obj2).j - ((vq4) obj).j;
            case 3:
                mi0 mi0Var = (mi0) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int compare = Integer.compare(mi0Var.c, mi0Var2.c);
                if (compare == 0) {
                    return mi0Var.b.compareTo(mi0Var2.b);
                }
                return compare;
            case 4:
                return Integer.compare(((ca1) obj2).b, ((ca1) obj).b);
            case 5:
                return ((am1) obj2).b() - ((am1) obj).b();
            case 6:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 8:
                String name = ((File) obj).getName();
                int i = ta2.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 9:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 10:
                return Integer.compare(((dy2) ((List) obj).get(0)).f, ((dy2) ((List) obj2).get(0)).f);
            case 11:
                List list = (List) obj;
                List list2 = (List) obj2;
                return ws1.f(ky2.c((ky2) Collections.max(list, new uk(14)), (ky2) Collections.max(list2, new uk(14)))).a(list.size(), list2.size()).b((ky2) Collections.max(list, new uk(15)), (ky2) Collections.max(list2, new uk(15)), new uk(15)).e();
            case 12:
                return ((cy2) Collections.max((List) obj)).compareTo((cy2) Collections.max((List) obj2));
            case 13:
                return ((hy2) ((List) obj).get(0)).compareTo((hy2) ((List) obj2).get(0));
            case 14:
                return ky2.c((ky2) obj, (ky2) obj2);
            case 15:
                ky2 ky2Var = (ky2) obj;
                ky2 ky2Var2 = (ky2) obj2;
                boolean z = ky2Var.e;
                int i2 = ky2Var.F;
                if (z && ky2Var.D) {
                    a = ly2.k;
                } else {
                    a = ly2.k.a();
                }
                ky2Var.f.getClass();
                ys1 b = ys1.a.c(ky2Var.U, ky2Var2.U).b(Integer.valueOf(ky2Var.G), Integer.valueOf(ky2Var2.G), a);
                if (ky2Var.Q && ky2Var.S) {
                    b = b.a(ky2Var.T, ky2Var2.T);
                }
                return b.c(ky2Var.R, ky2Var2.R).b(Integer.valueOf(i2), Integer.valueOf(ky2Var2.F), a).e();
            case 16:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b2 = bArr[i3];
                    byte b3 = bArr2[i3];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case 17:
                return c16.l(((t16) obj).b, ((t16) obj2).b);
            case 18:
                return ((i75) obj).a.compareTo(((i75) obj2).a);
            case 19:
                ty5 ty5Var = (ty5) obj;
                ty5 ty5Var2 = (ty5) obj2;
                return (ty5Var.b - ty5Var.a) - (ty5Var2.b - ty5Var2.a);
            case 20:
                od6 od6Var = (od6) obj;
                od6 od6Var2 = (od6) obj2;
                float f = od6Var.d0.p.b0;
                float f2 = od6Var2.d0.p.b0;
                if (f == f2) {
                    return c16.l(od6Var.w(), od6Var2.w());
                }
                return Float.compare(f, f2);
            case 21:
                return c16.l(((wh6) obj).getIndex(), ((wh6) obj2).getIndex());
            case 22:
                return ((cb0) ((t92) obj)).a.compareTo(((cb0) ((t92) obj2)).a);
            case 23:
                return ((xpa) obj).a - ((xpa) obj2).a;
            case 24:
                return Float.compare(((xpa) obj).c, ((xpa) obj2).c);
            case 25:
                yva yvaVar = (yva) obj;
                yva yvaVar2 = (yva) obj2;
                int compare2 = Integer.compare(yvaVar2.b, yvaVar.b);
                if (compare2 == 0) {
                    int compareTo = yvaVar.c.compareTo(yvaVar2.c);
                    if (compareTo == 0) {
                        return yvaVar.d.compareTo(yvaVar2.d);
                    }
                    return compareTo;
                }
                return compare2;
            case 26:
                yva yvaVar3 = (yva) obj;
                yva yvaVar4 = (yva) obj2;
                int compare3 = Integer.compare(yvaVar4.a, yvaVar3.a);
                if (compare3 == 0) {
                    int compareTo2 = yvaVar4.c.compareTo(yvaVar3.c);
                    if (compareTo2 == 0) {
                        return yvaVar4.d.compareTo(yvaVar3.d);
                    }
                    return compareTo2;
                }
                return compare3;
            case 27:
                return Integer.compare(((whd) obj).a.b, ((whd) obj2).a.b);
            default:
                return Long.compare(((vhd) obj).b, ((vhd) obj2).b);
        }
    }
}
