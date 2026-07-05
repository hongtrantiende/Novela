package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f0  reason: default package */
/* loaded from: classes.dex */
public abstract class f0 implements ny {
    public Object a;
    public Object b;
    public final Collection c;

    public f0(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.a = randomUUID;
        String uuid = ((UUID) this.a).toString();
        uuid.getClass();
        this.b = new ymd(uuid, (jmd) null, cls.getName(), (String) null, (tf2) null, (tf2) null, 0L, 0L, 0L, (w02) null, 0, (ng0) null, 0L, 0L, 0L, 0L, false, (mf8) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.c = fca.u(cls.getName());
    }

    public umd a() {
        boolean z;
        String str;
        umd b = b();
        w02 w02Var = ((ymd) this.b).j;
        if (w02Var.i.isEmpty() && !w02Var.e && !w02Var.c && !w02Var.d) {
            z = false;
        } else {
            z = true;
        }
        ymd ymdVar = (ymd) this.b;
        if (ymdVar.q) {
            if (!z) {
                if (ymdVar.g > 0) {
                    vs.m("Expedited jobs cannot be delayed");
                    return null;
                }
            } else {
                vs.m("Expedited jobs only support network and storage constraints");
                return null;
            }
        }
        String str2 = ymdVar.x;
        if (str2 == null) {
            List z0 = k4b.z0(ymdVar.c, new String[]{"."});
            if (z0.size() == 1) {
                str = (String) z0.get(0);
            } else {
                str = (String) sl1.j0(z0);
            }
            if (str.length() > 127) {
                str = k4b.L0(Token.SWITCH, str);
            }
            ymdVar.x = str;
        } else if (str2.length() > 127) {
            ((ymd) this.b).x = k4b.L0(Token.SWITCH, str2);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.a = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        ymd ymdVar2 = (ymd) this.b;
        ymdVar2.getClass();
        this.b = new ymd(uuid, ymdVar2.b, ymdVar2.c, ymdVar2.d, new tf2(ymdVar2.e), new tf2(ymdVar2.f), ymdVar2.g, ymdVar2.h, ymdVar2.i, new w02(ymdVar2.j), ymdVar2.k, ymdVar2.l, ymdVar2.m, ymdVar2.n, ymdVar2.o, ymdVar2.p, ymdVar2.q, ymdVar2.r, ymdVar2.s, ymdVar2.u, ymdVar2.v, ymdVar2.w, ymdVar2.x, ymdVar2.y, 524288);
        return b;
    }

    public abstract umd b();

    public void d() {
        ((ArrayList) this.c).clear();
        this.b = this.a;
        h();
    }

    @Override // defpackage.ny
    public void e(Object obj) {
        ((ArrayList) this.c).add(this.b);
        this.b = obj;
    }

    public abstract f0 g();

    public abstract void h();

    public f0 l(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((ymd) this.b).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((ymd) this.b).g) {
            return g();
        }
        vs.m("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    @Override // defpackage.ny
    public void n() {
        this.b = a82.h(1, (ArrayList) this.c);
    }

    @Override // defpackage.ny
    public Object r() {
        return this.b;
    }

    public f0(Object obj) {
        this.a = obj;
        this.c = new ArrayList();
        this.b = obj;
    }
}
