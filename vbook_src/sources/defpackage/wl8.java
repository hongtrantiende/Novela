package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wl8  reason: default package */
/* loaded from: classes3.dex */
public class wl8 {
    public final List a;
    public int b;

    public wl8(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(gi1 gi1Var) {
        Object obj;
        gi1Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj2 = list.get(this.b);
        if (!gi1Var.h(obj2)) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null && this.b < tl1.x(list)) {
            this.b++;
        }
        if (obj2 == null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (gi1Var.h(obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                return null;
            }
            return obj;
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wl8) {
                if (c16.i(this.a, ((wl8) obj).a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + sl1.C0(this.a);
    }
}
