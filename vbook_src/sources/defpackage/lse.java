package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lse  reason: default package */
/* loaded from: classes.dex */
public final class lse extends f5f implements b7e {
    public final yz C;
    public final yz D;
    public final yz E;
    public final yz F;
    public final sre G;
    public final xk9 H;
    public final yz I;
    public final yz J;
    public final yz K;
    public final yz d;
    public final yz e;
    public final yz f;

    /* JADX WARN: Type inference failed for: r2v1, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v10, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v2, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v3, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v4, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v5, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v6, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v7, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v8, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v9, types: [yz, jla] */
    public lse(a6f a6fVar) {
        super(a6fVar);
        this.d = new jla(0);
        this.e = new jla(0);
        this.f = new jla(0);
        this.C = new jla(0);
        this.D = new jla(0);
        this.E = new jla(0);
        this.I = new jla(0);
        this.J = new jla(0);
        this.K = new jla(0);
        this.F = new jla(0);
        this.G = new sre(this);
        this.H = new xk9(this, 21);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yz, jla] */
    public static final yz h0(soe soeVar) {
        ?? jlaVar = new jla(0);
        for (mpe mpeVar : soeVar.x()) {
            jlaVar.put(mpeVar.t(), mpeVar.u());
        }
        return jlaVar;
    }

    public static final dwe i0(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                    return dwe.AD_PERSONALIZATION;
                }
                return dwe.AD_USER_DATA;
            }
            return dwe.ANALYTICS_STORAGE;
        }
        return dwe.AD_STORAGE;
    }

    public final yve b0(String str, dwe dweVar) {
        W();
        d0(str);
        yne t0 = t0(str);
        if (t0 != null) {
            Iterator it = t0.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qme qmeVar = (qme) it.next();
                if (i0(qmeVar.t()) == dweVar) {
                    int u = qmeVar.u() - 1;
                    if (u != 1) {
                        if (u == 2) {
                            return yve.DENIED;
                        }
                    } else {
                        return yve.GRANTED;
                    }
                }
            }
        }
        return yve.UNINITIALIZED;
    }

    public final boolean c0(String str) {
        W();
        d0(str);
        yne t0 = t0(str);
        if (t0 == null) {
            return false;
        }
        for (qme qmeVar : t0.t()) {
            if (qmeVar.t() == 3 && qmeVar.v() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void d0(String str) {
        Y();
        W();
        am8.p(str);
        yz yzVar = this.E;
        if (yzVar.get(str) == null) {
            z9e z9eVar = this.b.c;
            a6f.U(z9eVar);
            ac3 f1 = z9eVar.f1(str);
            yz yzVar2 = this.K;
            yz yzVar3 = this.J;
            yz yzVar4 = this.I;
            yz yzVar5 = this.d;
            if (f1 == null) {
                yzVar5.put(str, null);
                this.f.put(str, null);
                this.e.put(str, null);
                this.C.put(str, null);
                this.D.put(str, null);
                yzVar.put(str, null);
                yzVar4.put(str, null);
                yzVar3.put(str, null);
                yzVar2.put(str, null);
                this.F.put(str, null);
                return;
            }
            ooe ooeVar = (ooe) g0(str, f1.a).k();
            e0(str, ooeVar);
            yzVar5.put(str, h0((soe) ooeVar.d()));
            yzVar.put(str, (soe) ooeVar.d());
            f0(str, (soe) ooeVar.d());
            yzVar4.put(str, ((soe) ooeVar.b).E());
            yzVar3.put(str, f1.b);
            yzVar2.put(str, f1.c);
        }
    }

    public final void e0(String str, ooe ooeVar) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        jla jlaVar = new jla(0);
        jla jlaVar2 = new jla(0);
        jla jlaVar3 = new jla(0);
        for (eoe eoeVar : Collections.unmodifiableList(((soe) ooeVar.b).D())) {
            hashSet.add(eoeVar.t());
        }
        lte lteVar = (lte) this.a;
        t7e t7eVar = lteVar.d;
        ppe ppeVar = lteVar.f;
        wme wmeVar = yme.V0;
        if (t7eVar.i0(null, wmeVar)) {
            arrayList2.addAll(Collections.unmodifiableList(((soe) ooeVar.b).J()));
        }
        while (i < ((soe) ooeVar.b).y()) {
            hoe hoeVar = (hoe) ((soe) ooeVar.b).z(i).k();
            if (hoeVar.g().isEmpty()) {
                lte.m(ppeVar);
                ppeVar.E.e("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String g = hoeVar.g();
                arrayList = arrayList2;
                String r = bce.r(hoeVar.g(), ctd.d, ctd.i);
                if (!TextUtils.isEmpty(r)) {
                    hoeVar.b();
                    ((loe) hoeVar.b).A(r);
                    ooeVar.b();
                    ((soe) ooeVar.b).M(i, (loe) hoeVar.d());
                }
                if (((loe) hoeVar.b).u() && ((loe) hoeVar.b).v()) {
                    jlaVar.put(g, Boolean.TRUE);
                }
                if (((loe) hoeVar.b).w() && ((loe) hoeVar.b).x()) {
                    jlaVar2.put(hoeVar.g(), Boolean.TRUE);
                }
                if (((loe) hoeVar.b).y()) {
                    if (((loe) hoeVar.b).z() >= 2 && ((loe) hoeVar.b).z() <= 65535) {
                        jlaVar3.put(hoeVar.g(), Integer.valueOf(((loe) hoeVar.b).z()));
                    } else {
                        lte.m(ppeVar);
                        ppeVar.E.g(hoeVar.g(), Integer.valueOf(((loe) hoeVar.b).z()), "Invalid sampling rate. Event name, sample rate");
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.e.put(str, hashSet);
        if (lteVar.d.i0(null, wmeVar)) {
            this.D.put(str, arrayList3);
        }
        this.f.put(str, jlaVar);
        this.C.put(str, jlaVar2);
        this.F.put(str, jlaVar3);
    }

    public final void f0(String str, soe soeVar) {
        lte lteVar = (lte) this.a;
        int C = soeVar.C();
        sre sreVar = this.G;
        if (C != 0) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.J.f(Integer.valueOf(soeVar.C()), "EES programs found");
            jve jveVar = (jve) soeVar.B().get(0);
            try {
                bde bdeVar = new bde();
                odd oddVar = bdeVar.a;
                ((tk1) oddVar.e).a.put("internal.remoteConfig", new bse(this, str, 2));
                ((tk1) oddVar.e).a.put("internal.appMetadata", new bse(this, str, 0));
                ((tk1) oddVar.e).a.put("internal.logger", new iq7(this, 1));
                bdeVar.b(jveVar);
                sreVar.m(str, bdeVar);
                lte.m(ppeVar);
                s56 s56Var = ppeVar.J;
                s56Var.g(str, Integer.valueOf(jveVar.u().u()), "EES program loaded for appId, activities");
                for (cve cveVar : jveVar.u().t()) {
                    lte.m(ppeVar);
                    s56Var.f(cveVar.t(), "EES program activity");
                }
                return;
            } catch (sge unused) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.f.f(str, "Failed to load EES program. appId");
                return;
            }
        }
        sreVar.n(str);
    }

    public final soe g0(String str, byte[] bArr) {
        Long l;
        lte lteVar = (lte) this.a;
        if (bArr == null) {
            return soe.L();
        }
        try {
            soe soeVar = (soe) ((ooe) e6f.I0(soe.K(), bArr)).d();
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            s56 s56Var = ppeVar.J;
            String str2 = null;
            if (soeVar.t()) {
                l = Long.valueOf(soeVar.u());
            } else {
                l = null;
            }
            if (soeVar.v()) {
                str2 = soeVar.w();
            }
            s56Var.g(l, str2, "Parsed config. version, gmp_app_id");
            return soeVar;
        } catch (i1e e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.E.g(ppe.f0(str), e, "Unable to merge remote config. appId");
            return soe.L();
        } catch (RuntimeException e2) {
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            ppeVar3.E.g(ppe.f0(str), e2, "Unable to merge remote config. appId");
            return soe.L();
        }
    }

    public final soe j0(String str) {
        Y();
        W();
        am8.p(str);
        d0(str);
        return (soe) this.E.get(str);
    }

    @Override // defpackage.b7e
    public final String k(String str, String str2) {
        W();
        d0(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final String k0(String str) {
        W();
        d0(str);
        return (String) this.I.get(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:47|48|(5:50|(2:142|143)(3:52|(2:53|(2:55|(2:57|58))(1:62))|61)|59|60|61)|145|146|(3:148|(2:150|151)(2:153|154)|152)|155|156|(4:157|158|159|(1:161)(2:188|(2:189|(2:191|(1:193)(1:194))(2:195|196))))|162|163|(3:164|165|166)|(2:167|168)|169|170|171|172|(1:174)|176|177) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0402, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0403, code lost:
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0415, code lost:
        if (r6.z() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0417, code lost:
        r3 = java.lang.Boolean.valueOf(r6.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0420, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0421, code lost:
        r5.put("session_scoped", r3);
        r5.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0433, code lost:
        if (r9.O0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0435, code lost:
        r0 = r14.f;
        defpackage.lte.m(r0);
        r0.f.f(defpackage.ppe.f0(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0446, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0448, code lost:
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0450, code lost:
        r1 = r14.f;
        defpackage.lte.m(r1);
        r1.f.g(defpackage.ppe.f0(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0460, code lost:
        r9.Y();
        r9.W();
        defpackage.am8.p(r30);
        r0 = r9.O0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0483, code lost:
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x05fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x05fb, code lost:
        r3 = r4.f;
        defpackage.lte.m(r3);
        r3.f.g(defpackage.ppe.f0(r30), r0, "Error storing remote config. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0621, code lost:
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0624, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0262, code lost:
        r0 = r5.v().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026e, code lost:
        if (r0.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
        if (((defpackage.cme) r0.next()).t() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027c, code lost:
        r0 = r14.f;
        defpackage.lte.m(r0);
        r0.E.g(defpackage.ppe.f0(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0291, code lost:
        r0 = r5.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0299, code lost:
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x029d, code lost:
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02af, code lost:
        if (r8 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02b1, code lost:
        r8 = (defpackage.kle) r23.next();
        r9.Y();
        r9.W();
        defpackage.am8.p(r30);
        defpackage.am8.s(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02cb, code lost:
        if (r8.v().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02cd, code lost:
        r0 = r14.f;
        defpackage.lte.m(r0);
        r0 = r0.E;
        r3 = defpackage.ppe.f0(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e2, code lost:
        if (r8.t() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02e4, code lost:
        r5 = java.lang.Integer.valueOf(r8.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ed, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02f0, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f1, code lost:
        r0.h("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02fc, code lost:
        r26 = r5;
        r5 = r8.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0317, code lost:
        if (r8.t() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0319, code lost:
        r1 = java.lang.Integer.valueOf(r8.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0322, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0323, code lost:
        r6.put("filter_id", r1);
        r6.put("event_name", r8.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0333, code lost:
        if (r8.D() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0335, code lost:
        r0 = java.lang.Boolean.valueOf(r8.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x033e, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x033f, code lost:
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0351, code lost:
        if (r9.O0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0353, code lost:
        r0 = r14.f;
        defpackage.lte.m(r0);
        r0.f.f(defpackage.ppe.f0(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0364, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0366, code lost:
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0372, code lost:
        r1 = r14.f;
        defpackage.lte.m(r1);
        r1.f.g(defpackage.ppe.f0(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0384, code lost:
        r27 = r6;
        r5 = r5.v().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0394, code lost:
        if (r5.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0396, code lost:
        r6 = (defpackage.cme) r5.next();
        r9.Y();
        r9.W();
        defpackage.am8.p(r30);
        defpackage.am8.s(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03b0, code lost:
        if (r6.v().isEmpty() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b2, code lost:
        r0 = r14.f;
        defpackage.lte.m(r0);
        r0 = r0.E;
        r3 = defpackage.ppe.f0(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03c7, code lost:
        if (r6.t() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03c9, code lost:
        r5 = java.lang.Integer.valueOf(r6.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03d2, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d3, code lost:
        r0.h("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03dc, code lost:
        r8 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03f7, code lost:
        if (r6.t() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03f9, code lost:
        r3 = java.lang.Integer.valueOf(r6.u());
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05e9 A[Catch: SQLiteException -> 0x05fa, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x05fa, blocks: (B:149:0x05d2, B:151:0x05e9), top: B:159:0x05d2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(java.lang.String r30, java.lang.String r31, java.lang.String r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.l0(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean m0(String str, String str2) {
        Boolean bool;
        W();
        d0(str);
        if (!"1".equals(k(str, "measurement.upload.blacklist_internal")) || !l6f.C0(str2)) {
            if ("1".equals(k(str, "measurement.upload.blacklist_public")) && l6f.Y0(str2)) {
                return true;
            }
            Map map = (Map) this.f.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean n0(String str, String str2) {
        Boolean bool;
        W();
        d0(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.C.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final List o0(String str) {
        W();
        d0(str);
        return (List) this.D.get(str);
    }

    public final int p0(String str, String str2) {
        Integer num;
        W();
        d0(str);
        Map map = (Map) this.F.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public final boolean q0(String str) {
        W();
        d0(str);
        yz yzVar = this.e;
        if (yzVar.get(str) != null) {
            if (((Set) yzVar.get(str)).contains("os_version") || ((Set) yzVar.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0(String str) {
        W();
        d0(str);
        yz yzVar = this.e;
        if (yzVar.get(str) != null && ((Set) yzVar.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean s0(String str, dwe dweVar) {
        W();
        d0(str);
        yne t0 = t0(str);
        if (t0 != null) {
            for (qme qmeVar : t0.t()) {
                if (dweVar == i0(qmeVar.t())) {
                    if (qmeVar.u() == 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final yne t0(String str) {
        W();
        d0(str);
        soe j0 = j0(str);
        if (j0 != null && j0.F()) {
            return j0.G();
        }
        return null;
    }

    @Override // defpackage.f5f
    public final void a0() {
    }
}
