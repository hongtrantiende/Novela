package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: g9a  reason: default package */
/* loaded from: classes3.dex */
public abstract class g9a extends h9a {
    public static b9a b0(Iterator it) {
        it.getClass();
        return new k02(new l56(it, 1));
    }

    public static Object c0(b9a b9aVar) {
        Iterator it = b9aVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static String d0(b9a b9aVar, String str) {
        b9aVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : b9aVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            hre.g(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List e0(b9a b9aVar) {
        b9aVar.getClass();
        Iterator it = b9aVar.iterator();
        if (!it.hasNext()) {
            return ks3.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return tl1.A(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
