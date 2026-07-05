package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: la3  reason: default package */
/* loaded from: classes.dex */
public final class la3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public la3(Comparator comparator) {
        this.a = 7;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int compare = ((kn4) obj3).compare(obj, obj2);
                if (compare == 0) {
                    return Long.valueOf(((n93) obj2).m).compareTo(Long.valueOf(((n93) obj).m));
                }
                return compare;
            case 1:
                int compare2 = ((kn4) obj3).compare(obj, obj2);
                if (compare2 == 0) {
                    return Long.valueOf(((n93) obj2).m).compareTo(Long.valueOf(((n93) obj).m));
                }
                return compare2;
            case 2:
                ux9 ux9Var = (ux9) obj3;
                return ((Comparable) ux9Var.invoke(obj)).compareTo((Comparable) ux9Var.invoke(obj2));
            case 3:
                int compare3 = ((la3) obj3).compare(obj, obj2);
                if (compare3 == 0) {
                    return Integer.valueOf(((lb5) obj).c).compareTo(Integer.valueOf(((lb5) obj2).c));
                }
                return compare3;
            case 4:
                int compare4 = ((pa5) obj3).compare(obj, obj2);
                if (compare4 == 0) {
                    return Integer.valueOf(((lb5) obj2).b).compareTo(Integer.valueOf(((lb5) obj).b));
                }
                return compare4;
            case 5:
                fv7 fv7Var = (fv7) obj3;
                return Float.valueOf(fv7Var.c(((Map.Entry) obj2).getKey())).compareTo(Float.valueOf(fv7Var.c(((Map.Entry) obj).getKey())));
            case 6:
                av7 av7Var = (av7) obj3;
                return Integer.valueOf(av7Var.c(((Number) obj).longValue())).compareTo(Integer.valueOf(av7Var.c(((Number) obj2).longValue())));
            case 7:
                int compare5 = ((Comparator) obj3).compare(obj, obj2);
                if (compare5 == 0) {
                    return od6.q0.compare(((b8a) obj).c, ((b8a) obj2).c);
                }
                return compare5;
            case 8:
                int compare6 = ((la3) obj3).compare(obj, obj2);
                if (compare6 == 0) {
                    return Integer.valueOf(((b8a) obj).f).compareTo(Integer.valueOf(((b8a) obj2).f));
                }
                return compare6;
            case 9:
                int compare7 = ((roa) obj3).compare(obj, obj2);
                if (compare7 == 0) {
                    return hxe.j(((ioa) ((yk8) obj).a).b, ((ioa) ((yk8) obj2).a).b);
                }
                return compare7;
            case 10:
                glb glbVar = (glb) obj3;
                return hxe.j((Comparable) ((HashMap) glbVar.e()).get((i45) obj), (Comparable) ((HashMap) glbVar.e()).get((i45) obj2));
            default:
                int compare8 = ((roa) obj3).compare(obj, obj2);
                if (compare8 == 0) {
                    return hxe.j(((wyb) obj).a, ((wyb) obj2).a);
                }
                return compare8;
        }
    }

    public /* synthetic */ la3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
