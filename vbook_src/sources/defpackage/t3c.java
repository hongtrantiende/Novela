package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t3c  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t3c implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t3c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [yz, java.util.Map, jla] */
    /* JADX WARN: Type inference failed for: r2v60, types: [yz, java.util.Map, jla] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        iw9 h1;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 16;
        int i2 = 15;
        int i3 = 14;
        int i4 = 4;
        int i5 = 2;
        int i6 = 3;
        int i7 = 1;
        switch (this.a) {
            case 0:
                aw7 aw7Var = (aw7) this.b;
                c4c c4cVar = (c4c) this.c;
                cs9 cs9Var = (cs9) obj;
                cs9Var.getClass();
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var != null) {
                    hk1 a = jdd.a(c4cVar);
                    sw2 sw2Var = ab3.a;
                    c4cVar.f(a, ru2.c, new byb(c4cVar, f76Var, cs9Var, (m42) null, 1));
                }
                aw7Var.setValue(null);
                return pvc.a;
            case 1:
                xt4 xt4Var = (xt4) this.c;
                mv mvVar = (mv) obj;
                mvVar.getClass();
                c6c c6cVar = ((p6c) this.b).a;
                if (c6cVar != null) {
                    String str = mvVar.a;
                    String str2 = c6cVar.a;
                    String str3 = c6cVar.b;
                    str2.getClass();
                    str3.getClass();
                    xt4Var.invoke(new c6c(str2, str3, str));
                }
                return pvc.a;
            case 2:
                s8c s8cVar = (s8c) this.b;
                m82 m82Var = (m82) this.c;
                ((ib3) obj).getClass();
                s8cVar.getClass();
                m82Var.getClass();
                z87.v(m82Var, null, null, new ov9(s8cVar, (m42) null, 24), 3);
                z87.v(m82Var, null, null, new q4c(s8cVar, m82Var, null, 8), 3);
                return new r6(s8cVar, 20);
            case 3:
                aw7 aw7Var2 = (aw7) this.b;
                gbc gbcVar = (gbc) this.c;
                cs9 cs9Var2 = (cs9) obj;
                cs9Var2.getClass();
                f76 f76Var2 = (f76) aw7Var2.getValue();
                if (f76Var2 != null) {
                    hk1 a2 = jdd.a(gbcVar);
                    sw2 sw2Var2 = ab3.a;
                    gbcVar.f(a2, ru2.c, new byb(gbcVar, f76Var2, cs9Var2, (m42) null, 8));
                }
                aw7Var2.setValue(null);
                return pvc.a;
            case 4:
                shc shcVar = (shc) this.c;
                aw7 aw7Var3 = (aw7) this.b;
                ((zn6) obj).getClass();
                if (((Boolean) aw7Var3.getValue()).booleanValue()) {
                    if (shcVar.F && !((phc) shcVar.C.getValue()).a) {
                        hk1 a3 = jdd.a(shcVar);
                        sw2 sw2Var3 = ab3.a;
                        z87.v(a3, ru2.c, null, new rhc(shcVar, null, 1), 2);
                    }
                } else {
                    aw7Var3.setValue(Boolean.TRUE);
                }
                return new Object();
            case 5:
                ib3 ib3Var = (ib3) obj;
                z87.v((m82) this.b, null, p82.d, new ze2((tkc) this.c, null), 1);
                return new ok(4);
            case 6:
                c3e c3eVar = (c3e) this.b;
                ib3 ib3Var2 = (ib3) obj;
                ((y4a) c3eVar).i0(new sra(new t3c(7, Thread.currentThread(), (m82) this.c)));
                return new r6(c3eVar, 21);
            case 7:
                Object obj2 = this.b;
                m82 m82Var2 = (m82) this.c;
                vt4 vt4Var = (vt4) obj;
                if (obj2 == Thread.currentThread()) {
                    vt4Var.invoke();
                } else {
                    z87.v(m82Var2, null, null, new bs(vt4Var, null, 1), 3);
                }
                return pvc.a;
            case 8:
                tkc tkcVar = (tkc) this.b;
                skc skcVar = (skc) this.c;
                ib3 ib3Var3 = (ib3) obj;
                tkcVar.j.add(skcVar);
                return new qf0(16, tkcVar, skcVar);
            case 9:
                tkc tkcVar2 = (tkc) this.b;
                tkc tkcVar3 = (tkc) this.c;
                ib3 ib3Var4 = (ib3) obj;
                tkcVar2.k.add(tkcVar3);
                return new qf0(14, tkcVar2, tkcVar3);
            case 10:
                ib3 ib3Var5 = (ib3) obj;
                return new qf0(15, (tkc) this.b, (pkc) this.c);
            case 11:
                s26 s26Var = (s26) this.b;
                zsc zscVar = (zsc) this.c;
                ctc ctcVar = (ctc) obj;
                synchronized (((v28) s26Var.b)) {
                    try {
                        boolean c = ctcVar.c();
                        ypa ypaVar = (ypa) s26Var.c;
                        if (c) {
                            ctc ctcVar2 = (ctc) ypaVar.m(zscVar, ctcVar);
                        } else {
                            ctc ctcVar3 = (ctc) ypaVar.n(zscVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return pvc.a;
            case 12:
                rxc rxcVar = (rxc) this.b;
                ((Long) obj).getClass();
                float f = rxcVar.e;
                rxcVar.e = nae.e;
                ((xt4) this.c).invoke(Float.valueOf(f));
                return pvc.a;
            case 13:
                g0d g0dVar = (g0d) this.b;
                List list = (List) obj;
                list.getClass();
                String str4 = ((wzc) this.c).a;
                str4.getClass();
                hk1 a4 = jdd.a(g0dVar);
                sw2 sw2Var4 = ab3.a;
                g0dVar.f(a4, ru2.c, new byb(g0dVar, str4, list, (m42) null, 14));
                return pvc.a;
            case 14:
                ubd ubdVar = (ubd) this.c;
                lbd lbdVar = (lbd) obj;
                lbdVar.getClass();
                String str5 = lbdVar.a;
                str5.getClass();
                hk1 a5 = jdd.a(ubdVar);
                sw2 sw2Var5 = ab3.a;
                ubdVar.f(a5, ru2.c, new b9d(ubdVar, str5, null, 1));
                ((aw7) this.b).setValue(Boolean.FALSE);
                return pvc.a;
            case 15:
                Integer num = (Integer) obj;
                num.getClass();
                ((xt4) this.b).invoke(num);
                t7d.e((t7d) this.c);
                return pvc.a;
            case 16:
                x04 x04Var = (x04) this.b;
                ((ib3) obj).getClass();
                x04Var.getClass();
                i04 i04Var = x04Var.E;
                r9d r9dVar = new r9d((bw7) this.c);
                i04Var.m.a(r9dVar);
                return new qf0(17, i04Var, r9dVar);
            case 17:
                Object obj3 = this.b;
                ArrayList arrayList = (ArrayList) this.c;
                String str6 = (String) obj;
                str6.getClass();
                synchronized (obj3) {
                    arrayList.add(str6);
                }
                return pvc.a;
            case 18:
                mw8 mw8Var = (mw8) this.c;
                lw8 lw8Var = (lw8) obj;
                if (((oed) this.b).K) {
                    lw8Var.o(mw8Var, 0, 0, nae.e);
                }
                return pvc.a;
            case 19:
                yjd yjdVar = (yjd) this.b;
                View view = (View) this.c;
                ib3 ib3Var6 = (ib3) obj;
                yjdVar.a(view);
                return new qf0(18, yjdVar, view);
            case 20:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                ((qmd) this.b).b.n(cw9Var, (pmd) this.c);
                return pvc.a;
            case 21:
                String str7 = (String) this.b;
                bnd bndVar = (bnd) this.c;
                cw9 cw9Var2 = (cw9) obj;
                cw9Var2.getClass();
                h1 = cw9Var2.h1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    h1.b0(1, str7);
                    ?? jlaVar = new jla(0);
                    ?? jlaVar2 = new jla(0);
                    while (h1.Z0()) {
                        String s0 = h1.s0(0);
                        if (!jlaVar.containsKey(s0)) {
                            jlaVar.put(s0, new ArrayList());
                        }
                        String s02 = h1.s0(0);
                        if (!jlaVar2.containsKey(s02)) {
                            jlaVar2.put(s02, new ArrayList());
                        }
                    }
                    h1.reset();
                    bndVar.b(cw9Var2, jlaVar);
                    bndVar.a(cw9Var2, jlaVar2);
                    ArrayList arrayList2 = new ArrayList();
                    while (h1.Z0()) {
                        String s03 = h1.s0(0);
                        jmd t = fxe.t((int) h1.getLong(i7));
                        byte[] blob = h1.getBlob(i5);
                        tf2 tf2Var = tf2.b;
                        tf2 f2 = rae.f(blob);
                        int i8 = (int) h1.getLong(i6);
                        int i9 = (int) h1.getLong(i4);
                        long j = h1.getLong(i3);
                        long j2 = h1.getLong(i2);
                        long j3 = h1.getLong(i);
                        ng0 q = fxe.q((int) h1.getLong(17));
                        long j4 = h1.getLong(18);
                        long j5 = h1.getLong(19);
                        int i10 = (int) h1.getLong(20);
                        long j6 = h1.getLong(21);
                        int i11 = (int) h1.getLong(22);
                        c28 r = fxe.r((int) h1.getLong(5));
                        w18 E = fxe.E(h1.getBlob(6));
                        if (((int) h1.getLong(7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((int) h1.getLong(8)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) h1.getLong(9)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((int) h1.getLong(10)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        w02 w02Var = new w02(E, r, z, z2, z3, z4, h1.getLong(11), h1.getLong(12), fxe.l(h1.getBlob(13)));
                        Object p = o17.p(h1.s0(0), jlaVar);
                        p.getClass();
                        List list2 = (List) p;
                        Object p2 = o17.p(h1.s0(0), jlaVar2);
                        p2.getClass();
                        arrayList2.add(new xmd(s03, t, f2, j, j2, j3, w02Var, i8, q, j4, j5, i10, i9, j6, i11, list2, (List) p2));
                        i = 16;
                        i2 = 15;
                        i3 = 14;
                        i7 = 1;
                        i4 = 4;
                        i5 = 2;
                        i6 = 3;
                    }
                    return arrayList2;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 22:
                jmd jmdVar = (jmd) this.b;
                String str8 = (String) this.c;
                cw9 cw9Var3 = (cw9) obj;
                cw9Var3.getClass();
                h1 = cw9Var3.h1("UPDATE workspec SET state=? WHERE id=?");
                try {
                    h1.m(1, fxe.z(jmdVar));
                    h1.b0(2, str8);
                    h1.Z0();
                    int y = tl1.y(cw9Var3);
                    h1.close();
                    return Integer.valueOf(y);
                } finally {
                }
            case 23:
                cw9 cw9Var4 = (cw9) obj;
                cw9Var4.getClass();
                ((bnd) this.b).b.n(cw9Var4, (ymd) this.c);
                return pvc.a;
            case 24:
                tf2 tf2Var2 = (tf2) this.b;
                String str9 = (String) this.c;
                cw9 cw9Var5 = (cw9) obj;
                cw9Var5.getClass();
                h1 = cw9Var5.h1("UPDATE workspec SET output=? WHERE id=?");
                try {
                    tf2 tf2Var3 = tf2.b;
                    h1.p(rae.l(tf2Var2), 1);
                    h1.b0(2, str9);
                    h1.Z0();
                    h1.close();
                    return pvc.a;
                } finally {
                }
            case 25:
                cw9 cw9Var6 = (cw9) obj;
                cw9Var6.getClass();
                ((dnd) this.b).b.n(cw9Var6, (cnd) this.c);
                return pvc.a;
            case 26:
                mw8 mw8Var2 = (mw8) this.b;
                atd atdVar = (atd) this.c;
                lw8 lw8Var2 = (lw8) obj;
                lw8Var2.getClass();
                int A = k27.A(atdVar.g());
                hm8 hm8Var = atdVar.m;
                lw8.L(lw8Var2, mw8Var2, A - ((int) (((py5) hm8Var.getValue()).a >> 32)), (k27.A(atdVar.h()) - ((int) (((py5) hm8Var.getValue()).a & 4294967295L))) + k27.A(((Number) atdVar.o.getValue()).floatValue()), null, 12);
                return pvc.a;
            default:
                z87.v((m82) this.b, null, null, new dsd((atd) this.c, (y78) obj, null, 0), 3);
                return pvc.a;
        }
    }

    public /* synthetic */ t3c(fdd fddVar, aw7 aw7Var, int i) {
        this.a = i;
        this.c = fddVar;
        this.b = aw7Var;
    }
}
