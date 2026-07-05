package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bnd  reason: default package */
/* loaded from: classes.dex */
public final class bnd {
    public final fu9 a;
    public final b23 b = new b23(4);

    public bnd(fu9 fu9Var) {
        this.a = fu9Var;
    }

    public final void a(cw9 cw9Var, yz yzVar) {
        vz vzVar = (vz) yzVar.keySet();
        yz yzVar2 = vzVar.a;
        if (yzVar2.isEmpty()) {
            return;
        }
        if (yzVar.c > 999) {
            q1d.q(yzVar, new zmd(this, cw9Var, 0));
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i = yzVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        iw9 h1 = cw9Var.h1(sb.toString());
        Iterator it = vzVar.iterator();
        int i3 = 1;
        while (true) {
            uz uzVar = (uz) it;
            if (uzVar.hasNext()) {
                h1.b0(i3, (String) uzVar.next());
                i3++;
            } else {
                try {
                    break;
                } finally {
                    h1.close();
                }
            }
        }
        h1.getClass();
        int r = que.r(h1, "work_spec_id");
        if (r == -1) {
            return;
        }
        while (h1.Z0()) {
            List list = (List) yzVar.get(h1.s0(r));
            if (list != null) {
                byte[] blob = h1.getBlob(0);
                tf2 tf2Var = tf2.b;
                list.add(rae.f(blob));
            }
        }
    }

    public final void b(cw9 cw9Var, yz yzVar) {
        vz vzVar = (vz) yzVar.keySet();
        yz yzVar2 = vzVar.a;
        if (yzVar2.isEmpty()) {
            return;
        }
        if (yzVar.c > 999) {
            q1d.q(yzVar, new zmd(this, cw9Var, 1));
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i = yzVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        iw9 h1 = cw9Var.h1(sb.toString());
        Iterator it = vzVar.iterator();
        int i3 = 1;
        while (true) {
            uz uzVar = (uz) it;
            if (uzVar.hasNext()) {
                h1.b0(i3, (String) uzVar.next());
                i3++;
            } else {
                try {
                    break;
                } finally {
                    h1.close();
                }
            }
        }
        h1.getClass();
        int r = que.r(h1, "work_spec_id");
        if (r == -1) {
            return;
        }
        while (h1.Z0()) {
            List list = (List) yzVar.get(h1.s0(r));
            if (list != null) {
                list.add(h1.s0(0));
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        gae.l(this.a, false, true, new a23(str, 29));
    }

    public final jmd d(String str) {
        str.getClass();
        return (jmd) gae.l(this.a, true, false, new a23(str, 22));
    }

    public final ymd e(String str) {
        str.getClass();
        return (ymd) gae.l(this.a, true, false, new a23(str, 21));
    }

    public final List f(String str) {
        str.getClass();
        return (List) gae.l(this.a, true, false, new and(str, 0));
    }

    public final void g(long j, String str) {
        str.getClass();
        ((Number) gae.l(this.a, false, true, new ik2(str, j, 8))).intValue();
    }

    public final void h(int i, String str) {
        str.getClass();
        gae.l(this.a, false, true, new bl(str, i, 6));
    }

    public final void i(long j, String str) {
        str.getClass();
        gae.l(this.a, false, true, new ik2(str, j, 9));
    }

    public final void j(jmd jmdVar, String str) {
        str.getClass();
        ((Number) gae.l(this.a, false, true, new t3c(22, jmdVar, str))).intValue();
    }

    public final void k(int i, String str) {
        str.getClass();
        gae.l(this.a, false, true, new bl(i, str, 7));
    }
}
