package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: roa  reason: default package */
/* loaded from: classes.dex */
public final class roa implements Comparator {
    public static final /* synthetic */ roa b = new roa(20);
    public static final /* synthetic */ roa c = new roa(25);
    public final /* synthetic */ int a;

    public /* synthetic */ roa(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return hxe.j((Comparable) ((yk8) obj2).b, (Comparable) ((yk8) obj).b);
            case 1:
                return Float.valueOf(((vra) obj).j).compareTo(Float.valueOf(((vra) obj2).j));
            case 2:
                return Integer.valueOf(((iyb) obj).a).compareTo(Integer.valueOf(((iyb) obj2).a));
            case 3:
                return Integer.valueOf(((ava) obj).a).compareTo(Integer.valueOf(((ava) obj2).a));
            case 4:
                return hxe.j((Integer) ((yk8) obj).a, (Integer) ((yk8) obj2).a);
            case 5:
                return hxe.j((nt6) ((Map.Entry) obj).getKey(), (nt6) ((Map.Entry) obj2).getKey());
            case 6:
                return Long.valueOf(((nh9) obj2).c).compareTo(Long.valueOf(((nh9) obj).c));
            case 7:
                return Long.valueOf(((b8b) obj).a).compareTo(Long.valueOf(((b8b) obj2).a));
            case 8:
                return hxe.j(((njb) obj).a, ((njb) obj2).a);
            case 9:
                return hxe.j(((pjb) obj).a, ((pjb) obj2).a);
            case 10:
                return Boolean.valueOf(((wyb) obj).c).compareTo(Boolean.valueOf(((wyb) obj2).c));
            case 11:
                return Integer.valueOf(((pc9) obj2).c).compareTo(Integer.valueOf(((pc9) obj).c));
            case 12:
                return Integer.valueOf(((pc9) obj2).c).compareTo(Integer.valueOf(((pc9) obj).c));
            case 13:
                return Integer.valueOf(((xmc) obj).c).compareTo(Integer.valueOf(((xmc) obj2).c));
            case 14:
                return Integer.valueOf(((s7c) obj2).a.a).compareTo(Integer.valueOf(((s7c) obj).a.a));
            case 15:
                return Long.valueOf(((e33) obj).i).compareTo(Long.valueOf(((e33) obj2).i));
            case 16:
                return Long.valueOf(((e33) obj2).i).compareTo(Long.valueOf(((e33) obj).i));
            case 17:
                return Boolean.valueOf(((wyb) obj).c).compareTo(Boolean.valueOf(((wyb) obj2).c));
            case 18:
                return Integer.valueOf(((String) obj2).length()).compareTo(Integer.valueOf(((String) obj).length()));
            case 19:
                return hxe.j(((vpd) obj).a, ((vpd) obj2).a);
            case 20:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 21:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 22:
                int a = eub.a(obj);
                int a2 = eub.a(obj2);
                if (a == a2) {
                    int C = a82.C(a);
                    if (C != 0) {
                        if (C != 1) {
                            if (C != 2) {
                                if (C == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                } else if (a != 0 && a2 != 0) {
                    return a - a2;
                } else {
                    throw null;
                }
            case 23:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
