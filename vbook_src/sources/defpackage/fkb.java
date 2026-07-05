package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fkb  reason: default package */
/* loaded from: classes.dex */
public final class fkb {
    public static final mfb d = new mfb(new ekb(0));
    public final HashMap a = new HashMap();
    public final fkb b;
    public final ArrayList c;

    public fkb(fkb fkbVar, ArrayList arrayList) {
        this.b = fkbVar;
        this.c = arrayList;
    }

    public final void a(wjb wjbVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                ((xt4) next).invoke(wjbVar);
            }
        }
        String str = wjbVar.c;
        HashMap hashMap = this.a;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new HashMap();
            hashMap.put(str, obj);
        }
        ((Map) obj).put(wjbVar.a, wjbVar);
    }

    public final wjb b(String str, String str2) {
        wjb b;
        wjb wjbVar;
        str.getClass();
        str2.getClass();
        Map map = (Map) this.a.get(str2);
        if (map != null && (wjbVar = (wjb) map.get(str)) != null) {
            return wjbVar;
        }
        fkb fkbVar = this.b;
        if (fkbVar != null && (b = fkbVar.b(str, str2)) != null) {
            wjb clone = b.clone();
            a(clone);
            return clone;
        }
        return null;
    }

    public final wjb c(String str, boolean z, String str2, String str3) {
        int i;
        boolean z2;
        str.getClass();
        str3.getClass();
        String obj = k4b.N0(str).toString();
        if (obj != null && obj.length() != 0) {
            wjb b = b(obj, str3);
            if (b != null) {
                return b;
            }
            if (str2 == null) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (c16.l(str.charAt(i), 32) <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z3) {
                        if (!z2) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                str2 = tte.r(str.subSequence(i2, length + 1).toString());
            }
            if (!z) {
                obj = str2;
            }
            wjb b2 = b(str2, str3);
            if (b2 != null) {
                if (z && !c16.i(obj, str2)) {
                    wjb clone = b2.clone();
                    obj.getClass();
                    clone.a = obj;
                    a(clone);
                    return clone;
                }
                return b2;
            }
            wjb wjbVar = new wjb(obj, str2, str3);
            a(wjbVar);
            return wjbVar;
        }
        cy7.i("String must not be empty");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fkb)) {
            return false;
        }
        return c16.i(this.a, ((fkb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
