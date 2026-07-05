package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i2c  reason: default package */
/* loaded from: classes3.dex */
public final class i2c implements a2c {
    public final y1c a;
    public final ii2 b;
    public final h1a c;

    static {
        r76[] r76VarArr = y1c.o;
    }

    public i2c(y1c y1cVar, ii2 ii2Var, h1a h1aVar) {
        this.a = y1cVar;
        this.b = ii2Var;
        this.c = h1aVar;
        sw2 sw2Var = ab3.a;
        z87.v(k27.a(ru2.c), null, null, new ov9(this, (m42) null, 22), 3);
    }

    public final void A(String str) {
        str.getClass();
        this.a.l.e(y1c.o[11], str);
    }

    public final void B(String str) {
        str.getClass();
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        zve.i(y1cVar.b(), eub.p("tts_voice_", c, "_", j), str);
    }

    public final xyb a() {
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        if (c16.i(c, "system")) {
            return new wgb();
        }
        boolean i = c16.i(c, "ai");
        ii2 ii2Var = this.b;
        if (i) {
            return new v(ii2Var);
        }
        if (((un2) ii2Var.I.k0(y1cVar.c()).e()) == null) {
            return new wgb();
        }
        return new h94(y1cVar.c(), ii2Var, this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r13 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r13 != r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r13 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.d2c
            if (r0 == 0) goto L13
            r0 = r13
            d2c r0 = (defpackage.d2c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            d2c r0 = new d2c
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            defpackage.hre.r(r13)
            goto L88
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            r12 = 0
            return r12
        L34:
            defpackage.hre.r(r13)
            goto L5a
        L38:
            defpackage.hre.r(r13)
            goto L48
        L3c:
            defpackage.hre.r(r13)
            r0.c = r4
            hs0 r13 = r12.p()
            if (r13 != r5) goto L48
            goto L87
        L48:
            sj4 r13 = (defpackage.sj4) r13
            mx r12 = new mx
            r1 = 9
            r12.<init>(r13, r1)
            r0.c = r3
            java.lang.Object r13 = defpackage.z1d.C(r12, r0)
            if (r13 != r5) goto L5a
            goto L87
        L5a:
            java.util.List r13 = (java.util.List) r13
            long r6 = defpackage.zj1.n()
            java.lang.String r12 = "yyyyMMdd_HHmmss"
            java.lang.String r12 = defpackage.zj1.f(r6, r12)
            java.lang.String r1 = "tts_skip_words_"
            java.lang.String r7 = r1.concat(r12)
            kq r9 = new kq
            r12 = 5
            r10 = 0
            r9.<init>(r13, r10, r12)
            r0.c = r2
            sw2 r12 = defpackage.ab3.a
            n35 r12 = defpackage.zz6.a
            he4 r6 = new he4
            r11 = 0
            java.lang.String r8 = "json"
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r13 = defpackage.z87.E(r12, r6, r0)
            if (r13 != r5) goto L88
        L87:
            return r5
        L88:
            if (r13 == 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2c.b(n42):java.lang.Object");
    }

    public final Integer c() {
        mm mmVar = (mm) this.b.b.a;
        bk2 bk2Var = new bk2(1);
        mmVar.getClass();
        return new Integer((int) ((Number) new xla(1626402116, new String[]{"DbAiTtsModel"}, mmVar, "DbAiTtsModel.sq", "count", "SELECT COUNT(*) FROM DbAiTtsModel", bk2Var).d()).longValue());
    }

    public final long d() {
        y1c y1cVar = this.a;
        return ((Number) y1cVar.h.c(y1c.o[7], y1cVar)).longValue();
    }

    public final jq6 e() {
        jq6 t = tl1.t();
        t.add(new vyb("system", "", false));
        t.add(new vyb("ai", "AI TTS", false));
        gk2 gk2Var = this.b.I;
        gk2Var.getClass();
        ko2 ko2Var = ko2.a;
        mm mmVar = (mm) gk2Var.a;
        zn2 zn2Var = new zn2(gk2Var, 1);
        mmVar.getClass();
        for (cy4 cy4Var : new xla(-843918732, new String[]{"DbExtension"}, mmVar, "DbExtension.sq", "getTTSExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND type = 5\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", zn2Var).c()) {
            t.add(new vyb(cy4Var.a, cy4Var.b, true));
        }
        return tl1.r(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [gs9] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public final List f() {
        ?? gs9Var;
        try {
            s46 s46Var = v46.a;
            y1c y1cVar = this.a;
            s46Var.getClass();
            sz szVar = new sz(c4b.a, 0);
            gs9Var = new ArrayList();
            for (Object obj : (Iterable) s46Var.a(szVar, (String) y1cVar.f.c(y1c.o[5], y1cVar))) {
                m66 m66Var = pe4.a;
                if (m66Var.j0(hn8.f(hn8.f(ie2.u(m66Var), "music"), (String) obj))) {
                    gs9Var.add(obj);
                }
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        boolean z = gs9Var instanceof gs9;
        List list = gs9Var;
        if (z) {
            list = null;
        }
        List list2 = list;
        if (list2 == null) {
            return ks3.a;
        }
        return list2;
    }

    public final float g() {
        y1c y1cVar = this.a;
        return ((Number) y1cVar.g.c(y1c.o[6], y1cVar)).floatValue();
    }

    public final int h() {
        Integer num;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_break_length_", c, "_", j);
        gi1 a = cm9.a(Integer.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            num = b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            num = (Integer) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            num = (Integer) b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            num = (Integer) b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            num = (Integer) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            num = (Integer) b.a(p);
        } else {
            vs.m("Invalid type!");
            return 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final int i() {
        Integer num;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_break_", c, "_", j);
        gi1 a = cm9.a(Integer.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            num = b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            num = (Integer) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            num = (Integer) b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            num = (Integer) b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            num = (Integer) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            num = (Integer) b.a(p);
        } else {
            vs.m("Invalid type!");
            return 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final String j() {
        String str;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        c.getClass();
        h49 b = y1cVar.b();
        String concat = "tts_engine_".concat(c);
        gi1 a = cm9.a(String.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            str = (String) b.c(concat);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            str = (String) b.d().b(concat);
        } else if (a.equals(cm9.a(String.class))) {
            str = b.f(concat);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            str = (String) b.b(concat);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            str = (String) b.d().a(concat);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            str = (String) b.a(concat);
        } else {
            vs.m("Invalid type!");
            return null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String k() {
        String str;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_language_", c, "_", j);
        gi1 a = cm9.a(String.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            str = (String) b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            str = (String) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            str = b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            str = (String) b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            str = (String) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            str = (String) b.a(p);
        } else {
            vs.m("Invalid type!");
            return null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final float l() {
        Float f;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_pitch_", c, "_", j);
        gi1 a = cm9.a(Float.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            f = (Float) b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            f = (Float) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            f = (Float) b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            f = b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            f = (Float) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            f = (Float) b.a(p);
        } else {
            vs.m("Invalid type!");
            return nae.e;
        }
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float m() {
        Float f;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_speed_", c, "_", j);
        gi1 a = cm9.a(Float.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            f = (Float) b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            f = (Float) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            f = (Float) b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            f = b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            f = (Float) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            f = (Float) b.a(p);
        } else {
            vs.m("Invalid type!");
            return nae.e;
        }
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final List n() {
        Object gs9Var;
        try {
            s46 s46Var = v46.a;
            y1c y1cVar = this.a;
            String a = y1cVar.a(y1cVar.c(), j());
            s46Var.getClass();
            gs9Var = (List) s46Var.a(new sz(c4b.a, 0), a);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (gs9Var instanceof gs9) {
            gs9Var = null;
        }
        List list = (List) gs9Var;
        if (list == null) {
            return ks3.a;
        }
        return list;
    }

    public final String o() {
        String str;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_voice_", c, "_", j);
        gi1 a = cm9.a(String.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            str = (String) b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            str = (String) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            str = b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            str = (String) b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            str = (String) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            str = (String) b.a(p);
        } else {
            vs.m("Invalid type!");
            return null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final hs0 p() {
        lm2 lm2Var = this.b.T;
        lm2Var.getClass();
        rp2 rp2Var = rp2.a;
        mm mmVar = (mm) lm2Var.a;
        yo2 yo2Var = new yo2(24);
        mmVar.getClass();
        s02 O = v9e.O(new xla(1876706263, new String[]{"DbTTSWord"}, mmVar, "DbTTSWord.sq", "getAll", "SELECT DbTTSWord.id, DbTTSWord.word, DbTTSWord.replace, DbTTSWord.ignoreCase, DbTTSWord.createAt, DbTTSWord.updateAt\nFROM DbTTSWord\nORDER BY createAt ASC", yo2Var));
        sw2 sw2Var = ab3.a;
        return new hs0(v9e.z(O, ru2.c), 28);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:24|25|26|27|28|29|(1:31)(5:33|12|(0)|14|(1:46)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2 A[Catch: all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00cb, blocks: (B:22:0x0071, B:47:0x00d2, B:38:0x00c2), top: B:61:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #3 {all -> 0x00cb, blocks: (B:22:0x0071, B:47:0x00d2, B:38:0x00c2), top: B:61:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ac -> B:28:0x00af). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cd -> B:45:0x00cf). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d3 -> B:49:0x00d9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.List r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2c.q(java.util.List, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:9)(2:26|27))(2:28|(1:30))|10|11|12|13|14))|31|6|(0)(0)|10|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        r6 = r6.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (defpackage.jy.a() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        r8 = defpackage.kw6.b;
        r0 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r8.a.a.compareTo(r0) <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        r8.a(r0, "Log", r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.f76 r6, defpackage.cs9 r7, defpackage.n42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.h2c
            if (r0 == 0) goto L13
            r0 = r8
            h2c r0 = (defpackage.h2c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h2c r0 = new h2c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            n82 r1 = defpackage.n82.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            cs9 r7 = r0.a
            defpackage.hre.r(r8)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L30:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            byte[] r8 = (byte[]) r8
            java.lang.String r6 = defpackage.r4b.F(r8)
            s46 r8 = defpackage.v46.a     // Catch: java.lang.Exception -> L60
            r8.getClass()     // Catch: java.lang.Exception -> L60
            sz r0 = new sz     // Catch: java.lang.Exception -> L60
            foa r1 = defpackage.goa.Companion     // Catch: java.lang.Exception -> L60
            s76 r1 = r1.serializer()     // Catch: java.lang.Exception -> L60
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L60
            s76 r0 = defpackage.wq9.H(r0)     // Catch: java.lang.Exception -> L60
            s76 r0 = (defpackage.s76) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r4 = r8.a(r0, r6)     // Catch: java.lang.Exception -> L60
            goto L82
        L60:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L69
            java.lang.String r6 = ""
        L69:
            boolean r8 = defpackage.jy.a()
            if (r8 == 0) goto L82
            kw6 r8 = defpackage.kw6.b
            iea r0 = defpackage.iea.e
            z56 r1 = r8.a
            iea r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L82
            java.lang.String r1 = "Log"
            r8.a(r0, r1, r6, r4)
        L82:
            java.util.List r4 = (java.util.List) r4
            ii2 r6 = r5.b
            lm2 r6 = r6.T
            r6a r8 = new r6a
            r0 = 19
            r8.<init>(r0, r7, r5, r4)
            defpackage.l0e.z(r6, r8)
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2c.r(f76, cs9, n42):java.lang.Object");
    }

    public final boolean s() {
        y1c y1cVar = this.a;
        return ((Boolean) y1cVar.e.c(y1c.o[4], y1cVar)).booleanValue();
    }

    public final boolean t() {
        Boolean a;
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        String p = eub.p("tts_punctuation_", c, "_", j);
        gi1 a2 = cm9.a(Boolean.class);
        if (a2.equals(cm9.a(Integer.TYPE))) {
            a = (Boolean) b.c(p);
        } else if (a2.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            a = (Boolean) b.d().b(p);
        } else if (a2.equals(cm9.a(String.class))) {
            a = (Boolean) b.f(p);
        } else if (a2.equals(cm9.a(Float.TYPE))) {
            a = (Boolean) b.b(p);
        } else if (a2.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            a = (Boolean) b.d().a(p);
        } else if (a2.equals(cm9.a(Boolean.TYPE))) {
            a = b.a(p);
        } else {
            vs.m("Invalid type!");
            return false;
        }
        if (a != null) {
            return a.booleanValue();
        }
        return true;
    }

    public final boolean u() {
        y1c y1cVar = this.a;
        return ((Boolean) y1cVar.i.c(y1c.o[8], y1cVar)).booleanValue();
    }

    public final void v(List list) {
        list.getClass();
        s46 s46Var = v46.a;
        s46Var.getClass();
        this.a.f.e(y1c.o[5], s46Var.b(new sz(c4b.a, 0), list));
    }

    public final void w(String str) {
        str.getClass();
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        c.getClass();
        zve.i(y1cVar.b(), "tts_engine_".concat(c), str);
    }

    public final void x(String str) {
        str.getClass();
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        zve.i(y1cVar.b(), eub.p("tts_language_", c, "_", j), str);
    }

    public final void y(float f) {
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        b.getClass();
        b.g("tts_pitch_" + c + "_" + j, f);
    }

    public final void z(float f) {
        y1c y1cVar = this.a;
        String c = y1cVar.c();
        String j = j();
        c.getClass();
        h49 b = y1cVar.b();
        b.getClass();
        b.g("tts_speed_" + c + "_" + j, f);
    }
}
