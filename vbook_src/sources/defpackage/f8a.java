package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f8a  reason: default package */
/* loaded from: classes.dex */
public final class f8a extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public static final f8a b = new f8a(2, 0);
    public static final f8a c = new f8a(2, 1);
    public static final f8a d = new f8a(2, 2);
    public static final f8a e = new f8a(2, 3);
    public static final f8a f = new f8a(2, 4);
    public static final f8a C = new f8a(2, 5);
    public static final f8a D = new f8a(2, 6);
    public static final f8a E = new f8a(2, 7);
    public static final f8a F = new f8a(2, 8);
    public static final f8a G = new f8a(2, 9);
    public static final f8a H = new f8a(2, 10);
    public static final f8a I = new f8a(2, 11);
    public static final f8a J = new f8a(2, 12);
    public static final f8a K = new f8a(2, 13);
    public static final f8a L = new f8a(2, 14);
    public static final f8a M = new f8a(2, 15);
    public static final f8a N = new f8a(2, 16);
    public static final f8a O = new f8a(2, 17);
    public static final f8a P = new f8a(2, 18);
    public static final f8a Q = new f8a(2, 19);
    public static final f8a R = new f8a(2, 20);
    public static final f8a S = new f8a(2, 21);
    public static final f8a T = new f8a(2, 22);
    public static final f8a U = new f8a(2, 23);
    public static final f8a V = new f8a(2, 24);
    public static final f8a W = new f8a(2, 25);
    public static final f8a X = new f8a(2, 26);
    public static final f8a Y = new f8a(2, 27);
    public static final f8a Z = new f8a(2, 28);
    public static final f8a a0 = new f8a(2, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8a(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        String str;
        hu4 hu4Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.addAll(list2);
                    return arrayList;
                }
                return list2;
            case 1:
                f32 f32Var = (f32) obj2;
                return (f32) obj;
            case 2:
                bf4 bf4Var = (bf4) obj2;
                return (bf4) obj;
            case 3:
                pvc pvcVar2 = (pvc) obj2;
                return (pvc) obj;
            case 4:
                pvc pvcVar3 = (pvc) obj2;
                return (pvc) obj;
            case 5:
                pvc pvcVar4 = (pvc) obj;
                pvc pvcVar5 = (pvc) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                pvc pvcVar6 = (pvc) obj;
                pvc pvcVar7 = (pvc) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                pvc pvcVar8 = (pvc) obj2;
                return (pvc) obj;
            case 8:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                xt9 xt9Var = (xt9) obj;
                int i2 = ((xt9) obj2).a;
                return xt9Var;
            case 10:
                wea weaVar = (wea) obj2;
                return (wea) obj;
            case 11:
                String str4 = (String) obj2;
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList(list3);
                    arrayList2.addAll(list4);
                    return arrayList2;
                }
                return list4;
            case 13:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 14:
                String str5 = (String) obj2;
                return (String) obj;
            case 15:
                if (obj != null || obj2 != null) {
                    vm1.h();
                    return null;
                }
                return null;
            case 16:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 17:
                g4 g4Var = (g4) obj;
                g4 g4Var2 = (g4) obj2;
                if (g4Var == null || (str = g4Var.a) == null) {
                    str = g4Var2.a;
                }
                if (g4Var == null || (hu4Var = g4Var.b) == null) {
                    hu4Var = g4Var2.b;
                }
                return new g4(str, hu4Var);
            case 18:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            case 19:
                b8a b8aVar = (b8a) obj2;
                Float valueOf = Float.valueOf((float) nae.e);
                u7a u7aVar = ((b8a) obj).d;
                k8a k8aVar = h8a.u;
                Object g = u7aVar.a.g(k8aVar);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = b8aVar.d.a.g(k8aVar);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, valueOf.floatValue()));
            case 20:
                ((rp3) obj).c = ((ug3) obj2).a;
                return pvcVar;
            case 21:
                ((rp3) obj).d = (sna) obj2;
                return pvcVar;
            case 22:
                ((sp3) obj).a = (xy4) obj2;
                return pvcVar;
            case 23:
                ((tp3) obj).a = (String) obj2;
                return pvcVar;
            case 24:
                ((tp3) obj).d = (xy4) obj2;
                return pvcVar;
            case 25:
                ((tp3) obj).b = (nyb) obj2;
                return pvcVar;
            case 26:
                ((tp3) obj).c = ((Number) obj2).intValue();
                return pvcVar;
            case 27:
                wy4 wy4Var = (wy4) obj2;
                if (wy4Var instanceof o5) {
                    return wy4Var;
                }
                return obj;
            case 28:
                wy4 wy4Var2 = (wy4) obj2;
                return obj;
            default:
                wy4 wy4Var3 = (wy4) obj2;
                if (wy4Var3 instanceof mid) {
                    return wy4Var3;
                }
                return obj;
        }
    }
}
