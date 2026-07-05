package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bnc  reason: default package */
/* loaded from: classes3.dex */
public final class bnc {
    public final ii2 a;
    public final q63 b;
    public final rc9 c;
    public final i94 d;
    public final se9 e;
    public final h1a f;
    public final Object g = new Object();
    public final HashMap h = new HashMap();

    public bnc(ii2 ii2Var, q63 q63Var, rc9 rc9Var, i94 i94Var, se9 se9Var, h1a h1aVar) {
        this.a = ii2Var;
        this.b = q63Var;
        this.c = rc9Var;
        this.d = i94Var;
        this.e = se9Var;
        this.f = h1aVar;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.g) {
            String str3 = str + "-" + str2;
            anc ancVar = (anc) this.h.get(str3);
            if (ancVar != null) {
                int i = ancVar.b - 1;
                ancVar.b = i;
                if (i == 0) {
                    ancVar.a.close();
                    this.h.remove(str3);
                }
            }
        }
    }

    public final ArrayList b() {
        ze9 ze9Var;
        Collection<anc> values = this.h.values();
        values.getClass();
        ArrayList arrayList = new ArrayList();
        for (anc ancVar : values) {
            zmc zmcVar = ancVar.a;
            if (zmcVar instanceof ze9) {
                ze9Var = (ze9) zmcVar;
            } else {
                ze9Var = null;
            }
            if (ze9Var != null) {
                arrayList.add(ze9Var);
            }
        }
        return arrayList;
    }

    public final anc c(String str, String str2) {
        Object obj;
        zmc n94Var;
        if (c16.i(str, "qt")) {
            n94Var = new ze9(str2, this.b, this.c, this.e);
        } else {
            ii2 ii2Var = this.a;
            gk2 gk2Var = ii2Var.I;
            gk2Var.getClass();
            lo2 lo2Var = lo2.a;
            mm mmVar = (mm) gk2Var.a;
            zn2 zn2Var = new zn2(gk2Var, 7);
            mmVar.getClass();
            Iterator it = new xla(630744953, new String[]{"DbExtension"}, mmVar, "DbExtension.sq", "getTranslateExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND type = 6\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", zn2Var).c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ey4) obj).a.equals(str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ey4 ey4Var = (ey4) obj;
            ey4Var.getClass();
            n94Var = new n94(ey4Var.a, ii2Var, this.d, this.f);
        }
        return new anc(n94Var);
    }

    public final zmc d(String str, String str2) {
        zmc zmcVar;
        str.getClass();
        str2.getClass();
        synchronized (this.g) {
            try {
                String str3 = str + "-" + str2;
                HashMap hashMap = this.h;
                Object obj = hashMap.get(str3);
                if (obj == null) {
                    obj = c(str, str2);
                    hashMap.put(str3, obj);
                }
                anc ancVar = (anc) obj;
                ancVar.b++;
                zmc zmcVar2 = ancVar.a;
                if (zmcVar2 instanceof gs9) {
                    zmcVar2 = null;
                }
                zmcVar = zmcVar2;
            }
        }
        return zmcVar;
    }
}
