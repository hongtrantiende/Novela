package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u3d  reason: default package */
/* loaded from: classes.dex */
public abstract class u3d {
    public static String a(Object obj) {
        String str;
        if (!(obj instanceof u3d)) {
            Class<u3d> cls = u3d.class;
            if (obj instanceof Class) {
                Class<u3d> D = nmd.D(cm9.a(cls));
                if (D != null) {
                    cls = D;
                }
                if (!obj.equals(cls)) {
                    return ((Class) obj).toString();
                }
                return "VagueType";
            } else if (obj instanceof gi1) {
                if (!obj.equals(cm9.a(cls))) {
                    return obj.toString();
                }
                return "VagueType";
            } else if (obj instanceof Collection) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(tl1.s(iterable, 10));
                for (Object obj2 : iterable) {
                    if (obj2 != null) {
                        str = a(obj2);
                    } else {
                        str = null;
                    }
                    arrayList.add(str);
                }
                return arrayList.toString();
            } else {
                return obj.toString();
            }
        }
        return "VagueType";
    }
}
