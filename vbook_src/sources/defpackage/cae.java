package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cae  reason: default package */
/* loaded from: classes3.dex */
public abstract class cae {
    public static final tu1 a = new tu1(new nv1(23), false, -822297026);
    public static final tu1 b = new tu1(new pv1(6), false, -1606818763);
    public static final tu1 c = new tu1(new pv1(7), false, 648685046);
    public static final tu1 d = new tu1(new pv1(8), false, -1390778441);
    public static final tu1 e = new tu1(new nv1(24), false, -120362433);
    public static final tu1 f = new tu1(new nv1(25), false, -904884170);
    public static final tu1 g = new tu1(new nv1(26), false, 1350619639);
    public static final tu1 h = new tu1(new nv1(27), false, -688843848);
    public static final tu1 i = new tu1(new nv1(28), false, 1349470343);
    public static final tu1 j = new tu1(new nv1(29), false, -1518328962);
    public static final tu1 k = new tu1(new pv1(0), false, 971135039);
    public static final tu1 l = new tu1(new pv1(1), false, -834368256);
    public static final tu1 m = new tu1(new pv1(2), false, 2051404936);
    public static final tu1 n = new tu1(new pv1(3), false, -816394369);
    public static final tu1 o = new tu1(new pv1(4), false, 1673069632);
    public static final tu1 p = new tu1(new pv1(5), false, -132433663);
    public static final String[] q = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static final rz4 A(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = rz4.c;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(29);
            rv4Var.o0(P);
        }
        return (rz4) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
    }

    public static int B(dee deeVar) {
        int i2;
        int i3 = 0;
        for (Object obj : deeVar) {
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i3 += i2;
        }
        return i3;
    }

    public static Provider C() {
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(q[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x065f  */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [kn6, m42] */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r15v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r73, defpackage.rv4 r74, defpackage.nq7 r75, final defpackage.cz7 r76, java.lang.String r77) {
        /*
            Method dump skipped, instructions count: 2988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cae.a(int, rv4, nq7, cz7, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r7 == r6) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.fy0 r7, defpackage.lhd r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.hx0
            if (r0 == 0) goto L13
            r0 = r9
            hx0 r0 = (defpackage.hx0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hx0 r0 = new hx0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            pvc r5 = defpackage.pvc.a
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            defpackage.hre.r(r9)
            return r5
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L33:
            lhd r8 = r0.a
            defpackage.hre.r(r9)
            goto L5d
        L39:
            defpackage.hre.r(r9)
            cza r7 = r7.F
            java.lang.Object r7 = r7.getValue()
            wx0 r7 = (defpackage.wx0) r7
            boolean r7 = r7.a
            if (r7 != 0) goto L49
            goto L6a
        L49:
            java.lang.String r7 = r8.f()
            if (r7 != 0) goto L50
            goto L6a
        L50:
            r0.a = r8
            r0.c = r3
            java.lang.String r7 = "\n        (function() {\n            var vb = window.__vb;\n            if (!vb) return;\n            if (vb.observer) { vb.observer.disconnect(); vb.observer = null; }\n            for (var id in vb.entries) {\n                var e = vb.entries[id];\n                if (!e || e.orig == null) continue;\n                try {\n                    if (e.attr == null) {\n                        e.node.nodeValue = e.orig;\n                        try { delete e.node.__vbId; } catch (x) { e.node.__vbId = null; }\n                    } else if (e.attr === 'value') {\n                        e.node.value = e.orig;\n                        e.node.__vbAttr = false;\n                    } else {\n                        e.node.setAttribute(e.attr, e.orig);\n                        e.node.__vbAttr = false;\n                    }\n                } catch (x) {}\n            }\n            window.__vb = { entries: {}, counter: 0, observer: null };\n        })();\n    "
            java.lang.Object r7 = r8.e(r7, r0)
            if (r7 != r6) goto L5d
            goto L69
        L5d:
            r0.a = r4
            r0.c = r2
            java.lang.String r7 = "\n        (function() {\n            var SKIP = { SCRIPT:1, STYLE:1, NOSCRIPT:1, CODE:1, PRE:1, TEXTAREA:1, IFRAME:1, SVG:1 };\n            // Translatable attributes per element.\n            var ATTRS = ['placeholder', 'alt', 'title', 'aria-label'];\n            if (!window.__vb) {\n                window.__vb = { entries: {}, counter: 0, observer: null };\n            }\n            var vb = window.__vb;\n            var chunk = [];\n            function flush() {\n                if (!chunk.length) return;\n                _callNativeFunction(JSON.stringify(['vbookTranslateCollect', JSON.stringify(chunk)]));\n                chunk = [];\n            }\n            function register(node, attr, value) {\n                var id = vb.counter++;\n                vb.entries[id] = { node: node, attr: attr, orig: value };\n                chunk.push({ id: String(id), text: value.trim() });\n                if (chunk.length >= 20) flush();\n            }\n            function collectAttrs(el) {\n                if (!el.getAttribute) return;\n                if (el.__vbAttr) return;\n                var did = false;\n                for (var i = 0; i < ATTRS.length; i++) {\n                    var v = el.getAttribute(ATTRS[i]);\n                    if (v && v.trim()) { register(el, ATTRS[i], v); did = true; }\n                }\n                // <input type=submit|button value=\"...\"> label.\n                if (el.tagName === 'INPUT') {\n                    var ty = (el.getAttribute('type') || '').toLowerCase();\n                    if ((ty === 'submit' || ty === 'button') && el.value && el.value.trim()) {\n                        register(el, 'value', el.value); did = true;\n                    }\n                }\n                if (did) el.__vbAttr = true;\n            }\n            function collectTree(root) {\n                // Text nodes.\n                var walker = document.createTreeWalker(root, NodeFilter.SHOW_TEXT, {\n                    acceptNode: function(node) {\n                        var p = node.parentElement;\n                        if (!p || SKIP[p.tagName]) return NodeFilter.FILTER_REJECT;\n                        if (node.__vbId != null) return NodeFilter.FILTER_REJECT;\n                        var t = node.nodeValue;\n                        return (t && t.trim()) ? NodeFilter.FILTER_ACCEPT : NodeFilter.FILTER_REJECT;\n                    }\n                });\n                var n;\n                while ((n = walker.nextNode())) {\n                    n.__vbId = vb.counter;\n                    register(n, null, n.nodeValue);\n                }\n                // Element attributes.\n                var elWalker = document.createTreeWalker(root, NodeFilter.SHOW_ELEMENT, {\n                    acceptNode: function(el) {\n                        return SKIP[el.tagName] ? NodeFilter.FILTER_REJECT : NodeFilter.FILTER_ACCEPT;\n                    }\n                });\n                if (root.nodeType === 1) collectAttrs(root);\n                var e;\n                while ((e = elWalker.nextNode())) collectAttrs(e);\n            }\n\n            // <title> lives in <head>, outside body. Setting its text node value\n            // updates document.title (tab title).\n            var titleNode = document.querySelector('title');\n            titleNode = titleNode && titleNode.firstChild;\n            if (titleNode && titleNode.__vbId == null && titleNode.nodeValue && titleNode.nodeValue.trim()) {\n                titleNode.__vbId = vb.counter;\n                register(titleNode, null, titleNode.nodeValue);\n            }\n\n            collectTree(document.body);\n            flush();\n\n            // Re-collect content inserted after the first pass (lazy / scroll).\n            if (!vb.observer) {\n                var pending = false;\n                vb.observer = new MutationObserver(function() {\n                    if (pending) return;\n                    pending = true;\n                    setTimeout(function() {\n                        pending = false;\n                        var c2 = [];\n                        // Reuse collectTree but it pushes into the outer `chunk`;\n                        // run a fresh pass over the whole body (already-tagged\n                        // nodes are skipped) and flush.\n                        chunk = c2;\n                        collectTree(document.body);\n                        if (chunk.length) flush();\n                    }, 300);\n                });\n                vb.observer.observe(document.body, { childList: true, subtree: true });\n            }\n        })();\n    "
            java.lang.Object r7 = r8.e(r7, r0)
            if (r7 != r6) goto L6a
        L69:
            return r6
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cae.b(fy0, lhd, n42):java.lang.Object");
    }

    public static final void c(int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i3;
        boolean z;
        String str2;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(857897958);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if ((i3 & Token.DO) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p2);
            String A = yqe.A((y3b) s2b.s0.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.j;
            kq7 kq7Var = kq7.a;
            cvb.c(A, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 131068);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 16.0f));
            str2 = str;
            dye.b(null, jce.E(-1090151443, new jd1(str2, 13), rv4Var2), rv4Var2, 48, 1);
            hl5.w(kq7Var, 16.0f, rv4Var2, true);
        } else {
            str2 = str;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new le7(str2, nq7Var, xt4Var, i2, 1);
        }
    }

    public static final void d(boolean z, xt4 xt4Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        xt4Var.getClass();
        rv4Var.g0(-1937380448);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            if (i7 != 0) {
                z = true;
            }
            Object obj = (av2) rv4Var.j(h86.a);
            Object D = yae.D(xt4Var, rv4Var);
            aw7 D2 = yae.D(Boolean.valueOf(z), rv4Var);
            boolean f2 = rv4Var.f(D2) | rv4Var.f(D) | rv4Var.h(obj);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new nq3(obj, D2, D, 6);
                rv4Var.o0(P);
            }
            yte.c(xt4Var, obj, (xt4) P, rv4Var);
        } else {
            rv4Var.X();
        }
        boolean z3 = z;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new of0(z3, xt4Var, i2, i3, 1);
        }
    }

    public static final void e(kj6 kj6Var, List list, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean h2;
        int i4;
        int i5;
        kj6Var.getClass();
        list.getClass();
        rv4Var.g0(715701990);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(kj6Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = rv4Var.f(list);
            } else {
                h2 = rv4Var.h(list);
            }
            if (h2) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        boolean z3 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            ho5 ho5Var = (ho5) rv4Var.j(jo5.a);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new k97(20);
                rv4Var.o0(P);
            }
            k97 k97Var = (k97) P;
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h3 = z2 | rv4Var.h(k97Var);
            if ((i3 & Token.ASSIGN_MOD) == 32 || ((i3 & 64) != 0 && rv4Var.h(list))) {
                z3 = true;
            }
            boolean f2 = h3 | z3 | rv4Var.f(ho5Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                z45 z45Var = new z45(kj6Var, k97Var, list, ho5Var, (m42) null, 14);
                rv4Var.o0(z45Var);
                P2 = z45Var;
            }
            yte.i(list, kj6Var, ho5Var, (lu4) P2, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(i2, 23, (Object) kj6Var, (Object) list, false);
        }
    }

    public static final void f(rz4 rz4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        rz4Var.getClass();
        rv4Var.g0(1226734059);
        if (rv4Var.f(rz4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            xo xoVar = (xo) rv4Var.j(dy1.s);
            boolean booleanValue = ((Boolean) rz4Var.a.getValue()).booleanValue();
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new og7(rz4Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(-329113577, new sv4(16, xoVar, rz4Var), rv4Var), null, null, jce.E(1319405364, new pg7(rz4Var, 0, (byte) 0), rv4Var), ak0.c, null, 0L, 0L, nae.e, false, false, jce.E(1261760703, new pg7(rz4Var, 1, (byte) 0), rv4Var), rv4Var, 1769856, 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pg7(rz4Var, i2);
        }
    }

    public static final void g(boolean z, String str, String str2, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        String str3;
        int i4;
        int i5;
        int i6;
        int i7;
        xt4Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(1708042964);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        int i8 = i3 | 48;
        if ((i2 & 384) == 0) {
            if (rv4Var.f(str2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i8 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((i8 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(1830613904);
                h(z, str2, xt4Var, vt4Var, rv4Var, i8 & 65534);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1830871824);
                i(z, str2, xt4Var, vt4Var, rv4Var, i8 & 65534);
                rv4Var.q(false);
            }
            str3 = "";
        } else {
            rv4Var.X();
            str3 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a83(z, str3, str2, xt4Var, vt4Var, i2);
        }
    }

    public static final void h(boolean z, String str, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(194307062);
        if ((i2 & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            z2 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f("")) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(str)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i3 & 1, z3)) {
            nk0 nk0Var = kh5.b;
            nq7 y = zbe.y(zbe.C(mwe.u(pna.f(kq7.a, 1.0f), false, 15), nae.e, 40.0f, nae.e, nae.e, 13), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new txb(22);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.t((xt4) P));
            lz3 i9 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new txb(23);
                rv4Var.o0(P2);
            }
            z87.a(z2, xt4Var, a2, i9.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, y, jce.E(-1181519916, new dlc(str, xt4Var, vt4Var, 0), rv4Var), rv4Var, (i3 & 14) | 805531008 | ((i3 >> 6) & Token.ASSIGN_MOD), 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new elc(z, str, xt4Var, vt4Var, i2, 0);
        }
    }

    public static final void i(boolean z, String str, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(-198564594);
        if ((i2 & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            z2 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f("")) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(str)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i3 & 1, z3)) {
            nk0 nk0Var = kh5.c;
            nq7 s = pna.s(zbe.y(zbe.C(mwe.u(kq7.a, false, 15), nae.e, 30.0f, 40.0f, nae.e, 9), 12.0f), 400.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new txb(24);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.t((xt4) P));
            lz3 i9 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new txb(25);
                rv4Var.o0(P2);
            }
            z87.a(z2, xt4Var, a2, i9.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, s, jce.E(-1574391572, new dlc(str, xt4Var, vt4Var, 1), rv4Var), rv4Var, (i3 & 14) | 805531008 | ((i3 >> 6) & Token.ASSIGN_MOD), 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new elc(z, str, xt4Var, vt4Var, i2, 1);
        }
    }

    public static final void j(qc9 qc9Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1585510580);
        if (rv4Var2.f(qc9Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var2.h(vt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 z2 = zbe.z(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.b), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), 12.0f, 8.0f);
            gv9 a2 = ev9.a(new hz(12.0f, true, new vs(2)), kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p2);
            cvb.c(qc9Var.b, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 0, 131064);
            rv4Var2 = rv4Var;
            kwe.d(rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0), null, 0L, vt4Var, rv4Var2, (i8 << 3) & 7168, 6);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(qc9Var, nq7Var, vt4Var, i2, 6);
        }
    }

    public static final void k(cz7 cz7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(673305493);
        if (rv4Var.f(cz7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                bx7 bx7Var = (bx7) ((fdd) voe.z(cm9.a(bx7.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(bx7Var.d, rv4Var);
                fxe.h(yqe.A((y3b) x2b.l0.getValue(), rv4Var), pna.c, false, jce.E(-2024170991, new h64(cz7Var, 18), rv4Var), jce.E(-1918037958, new em7(1, bx7Var, z2), rv4Var), null, jce.E(870886496, new xw7(z2, bx7Var), rv4Var), rv4Var, 1600560, 36);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i2, 19);
        }
    }

    public static final void l(h2a h2aVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        rv4Var.g0(-477152587);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(h2aVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new y82(h2aVar, 1);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, (i3 >> 3) & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z82(h2aVar, nq7Var, i2, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x039f, code lost:
        if (r13 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03a2, code lost:
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03b3, code lost:
        if (r13 == null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Type inference failed for: r11v21, types: [int] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final defpackage.amc r38, boolean r39, long r40, defpackage.nq7 r42, defpackage.rh8 r43, final defpackage.vt4 r44, defpackage.rv4 r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cae.m(amc, boolean, long, nq7, rh8, vt4, rv4, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    public static final void n(qlc qlcVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Object obj;
        String str;
        int i7;
        String str2;
        aw7 aw7Var;
        int i8;
        dz dzVar;
        mk0 mk0Var;
        int i9;
        Object obj2;
        ?? r4;
        String str3;
        aw7 aw7Var2;
        nk0 nk0Var;
        rv4 rv4Var2;
        String str4;
        String str5;
        float f2;
        aw7 aw7Var3;
        kq7 kq7Var;
        aw7 aw7Var4;
        boolean z2;
        rv4 rv4Var3 = rv4Var;
        ba5 ba5Var = lre.g;
        u22 u22Var = r0f.d;
        mk0 mk0Var2 = kh5.G;
        nk0 nk0Var2 = kh5.a;
        rv4Var3.g0(1330411703);
        if (rv4Var3.f(qlcVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (rv4Var3.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var3.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var3.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if ((i13 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i13 & 1, z)) {
            Object P = rv4Var3.P();
            Object obj3 = ax1.a;
            if (P == obj3) {
                P = yae.z(Boolean.FALSE);
                rv4Var3.o0(P);
            }
            aw7 aw7Var5 = (aw7) P;
            Object P2 = rv4Var3.P();
            if (P2 == obj3) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var3.o0(P2);
            }
            aw7 aw7Var6 = (aw7) P2;
            dz dzVar2 = lz.a;
            gv9 a2 = ev9.a(dzVar2, mk0Var2, rv4Var3, 48);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var3, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var3, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var3, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var3);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var3, p2);
            float f3 = 1.0f;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            we6 we6Var = new we6(f3, true);
            b37 d2 = fu0.d(nk0Var2, false);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l3 = rv4Var3.l();
            nq7 p3 = lye.p(rv4Var3, we6Var);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar, rv4Var3, d2);
            jce.F(npVar2, rv4Var3, l3);
            s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
            jce.F(npVar4, rv4Var3, p3);
            Object P3 = rv4Var3.P();
            if (P3 == obj3) {
                P3 = new p0c(aw7Var5, 25);
                rv4Var3.o0(P3);
            }
            kq7 kq7Var2 = kq7.a;
            nq7 t = q1d.t(1, (vt4) P3, rv4Var3, kq7Var2, false);
            gv9 a3 = ev9.a(dzVar2, mk0Var2, rv4Var3, 48);
            int hashCode3 = Long.hashCode(rv4Var3.T);
            xt8 l4 = rv4Var3.l();
            nq7 p4 = lye.p(rv4Var3, t);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar, rv4Var3, a3);
            jce.F(npVar2, rv4Var3, l4);
            s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
            jce.F(npVar4, rv4Var3, p4);
            String str6 = qlcVar.b;
            int i14 = qlcVar.h;
            String str7 = qlcVar.g;
            String str8 = qlcVar.f;
            List list = qlcVar.i;
            boolean f4 = rv4Var3.f(str6) | rv4Var3.f(list);
            Object P4 = rv4Var3.P();
            if (f4 || P4 == obj3) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (c16.i(qlcVar.b, ((tmc) obj).a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                P4 = (tmc) obj;
                rv4Var3.o0(P4);
            }
            tmc tmcVar = (tmc) P4;
            if (tmcVar != null) {
                str = tmcVar.a;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (str.equals("qt")) {
                rv4Var3.e0(-2016613221);
                dxe.i(rp5.a((wk3) ok3.C.getValue(), rv4Var3, 0), null, tte.k(pna.n(kq7Var2, 24.0f), uu9.a), rv4Var, 24624, 232);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
                i7 = i14;
                str2 = str8;
                r4 = 0;
                obj2 = obj3;
                aw7Var = aw7Var6;
                i8 = i13;
                aw7Var2 = aw7Var5;
                dzVar = dzVar2;
                nk0Var = nk0Var2;
                mk0Var = mk0Var2;
                i9 = 2;
                str3 = "";
            } else {
                rv4Var3.e0(-2016252815);
                i7 = i14;
                str2 = str8;
                aw7Var = aw7Var6;
                i8 = i13;
                dzVar = dzVar2;
                mk0Var = mk0Var2;
                i9 = 2;
                obj2 = obj3;
                r4 = 0;
                str3 = "";
                aw7Var2 = aw7Var5;
                nk0Var = nk0Var2;
                do5.a(new h54(0L, str, ""), u22Var, false, null, null, null, tte.k(pna.n(kq7Var2, 24.0f), uu9.a), null, rv4Var, 805306416, 380);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.s(kq7Var2, 8.0f));
            if (tmcVar != null) {
                str4 = tmcVar.b;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str5 = str3;
            } else {
                str5 = str4;
            }
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.j;
            long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            cvb.c(str5, l0e.u(new we6(f2, r4)), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114680);
            xbe.i(rv4Var, pna.s(kq7Var2, 4.0f));
            nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, r4), null, pna.n(kq7Var2, 16.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, 432, 0);
            xbe.i(rv4Var, pna.s(kq7Var2, 4.0f));
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            Object P5 = rv4Var.P();
            Object obj4 = obj2;
            if (P5 == obj4) {
                aw7Var3 = aw7Var2;
                P5 = new p0c(aw7Var3, 26);
                rv4Var.o0(P5);
            } else {
                aw7Var3 = aw7Var2;
            }
            nk0 nk0Var3 = nk0Var;
            iue.e(booleanValue, nk0Var3, 0L, kq7Var2, nae.e, null, (vt4) P5, jce.E(457324981, new ob9(7, qlcVar, xt4Var, aw7Var3), rv4Var), rv4Var, 14158896, 52);
            nq7 k2 = tte.k(hl5.e(rv4Var, true, true, kq7Var2, 40.0f), uu9.a);
            dz dzVar3 = dzVar;
            gv9 a4 = ev9.a(dzVar3, kh5.F, rv4Var, r4);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, k2);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            np npVar5 = qw1.f;
            jce.F(npVar5, rv4Var, a4);
            np npVar6 = qw1.e;
            jce.F(npVar6, rv4Var, l5);
            Integer valueOf2 = Integer.valueOf(hashCode4);
            np npVar7 = qw1.g;
            jce.F(npVar7, rv4Var, valueOf2);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var);
            np npVar8 = qw1.d;
            jce.F(npVar8, rv4Var, p5);
            nq7 k3 = tte.k(kq7Var2, ((h27) rv4Var.j(tzaVar)).c.b);
            Object P6 = rv4Var.P();
            if (P6 == obj4) {
                kq7Var = kq7Var2;
                aw7Var4 = aw7Var;
                P6 = new p0c(aw7Var4, 27);
                rv4Var.o0(P6);
            } else {
                kq7Var = kq7Var2;
                aw7Var4 = aw7Var;
            }
            aw7 aw7Var7 = aw7Var4;
            nq7 v = nmd.v(pna.c(lbe.f(15, (vt4) P6, k3, null, false), 1.0f), rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), ba5Var);
            gv9 a5 = ev9.a(dzVar3, mk0Var, rv4Var, 48);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l6 = rv4Var.l();
            nq7 p6 = lye.p(rv4Var, v);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar5, rv4Var, a5);
            jce.F(npVar6, rv4Var, l6);
            s21.t(hashCode5, rv4Var, npVar7, rv4Var, kgVar2);
            jce.F(npVar8, rv4Var, p6);
            String str9 = str2;
            boolean f5 = rv4Var.f(str9) | rv4Var.f(str7);
            Object P7 = rv4Var.P();
            if (f5 || P7 == obj4) {
                jq6 t2 = tl1.t();
                t2.add(new yk8(0, (y3b) z1b.m.getValue()));
                if (str7.length() > 0) {
                    t2.add(new yk8(Integer.valueOf(i9), (y3b) z1b.o.getValue()));
                }
                if (str9.length() > 0) {
                    t2.add(new yk8(1, (y3b) z1b.n.getValue()));
                }
                P7 = tl1.r(t2);
                rv4Var.o0(P7);
            }
            List<yk8> list2 = (List) P7;
            int i15 = i7;
            boolean d3 = rv4Var.d(i15) | rv4Var.f(list2);
            Object P8 = rv4Var.P();
            yk8 yk8Var = P8;
            if (d3 || P8 == obj4) {
                for (yk8 yk8Var2 : list2) {
                    if (((Number) yk8Var2.a).intValue() == i15) {
                        rv4Var.o0(yk8Var2);
                        yk8Var = yk8Var2;
                    }
                }
                p1a.l("Collection contains no element matching the predicate.");
                return;
            }
            kq7 kq7Var3 = kq7Var;
            cvb.c(yqe.A((y3b) ((yk8) yk8Var).b, rv4Var), zbe.C(kq7Var, 16.0f, nae.e, nae.e, nae.e, 14), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).k, rv4Var, 48, 0, 131064);
            xbe.i(rv4Var, pna.s(kq7Var3, 4.0f));
            nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, 0), null, pna.n(kq7Var3, 16.0f), r0f.y(rv4Var).q, rv4Var, 432, 0);
            xbe.i(rv4Var, pna.s(kq7Var3, 8.0f));
            boolean booleanValue2 = ((Boolean) aw7Var7.getValue()).booleanValue();
            Object P9 = rv4Var.P();
            if (P9 == obj4) {
                P9 = new p0c(aw7Var7, 28);
                rv4Var.o0(P9);
            }
            iue.e(booleanValue2, nk0Var3, 0L, kq7Var3, nae.e, null, (vt4) P9, jce.E(-1790672873, new g83(list2, qlcVar, xt4Var2, aw7Var7), rv4Var), rv4Var, 14158896, 52);
            s21.x(rv4Var, true, kq7Var3, 2.0f, rv4Var);
            nq7 v2 = nmd.v(tte.k(pna.c(kq7Var3, 1.0f), r0f.z(rv4Var).b), r0f.y(rv4Var).c, ba5Var);
            if ((i8 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P10 = rv4Var.P();
            if (z2 || P10 == obj4) {
                P10 = new a3c(20, vt4Var);
                rv4Var.o0(P10);
            }
            nq7 A = zbe.A(lbe.f(15, (vt4) P10, v2, null, false), 20.0f, nae.e, i9);
            b37 d4 = fu0.d(nk0Var3, false);
            int hashCode6 = Long.hashCode(rv4Var.T);
            xt8 l7 = rv4Var.l();
            nq7 p7 = lye.p(rv4Var, A);
            rw1.k.getClass();
            zx1 zx1Var3 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d4);
            jce.F(qw1.e, rv4Var, l7);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode6));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p7);
            String A2 = yqe.A((y3b) b3b.F.getValue(), rv4Var);
            oyb oybVar2 = r0f.A(rv4Var).k;
            cvb.c(A2, pu0.a.a(kq7Var3, kh5.e), r0f.y(rv4Var).d, null, 0L, null, dq4.f, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar2, rv4Var, 1572864, 24576, 114616);
            rv4Var3 = rv4Var;
            hl5.v(rv4Var3, true, true, true);
        } else {
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new wp0((Object) qlcVar, nq7Var, xt4Var, xt4Var2, (hu4) vt4Var, i2, 27);
        }
    }

    public static final void o(String str, List list, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        Object obj;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var = kh5.a;
        rv4Var2.g0(-1654007714);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var2.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new p0c(aw7Var, 29);
                rv4Var2.o0(P2);
            }
            nq7 t = q1d.t(1, (vt4) P2, rv4Var2, nq7Var, false);
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p2);
            pu0 pu0Var = pu0.a;
            nk0 nk0Var2 = kh5.e;
            kq7 kq7Var = kq7.a;
            nq7 a2 = pu0Var.a(kq7Var, nk0Var2);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, a2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            if ((i10 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i10 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            String P3 = rv4Var2.P();
            if (z4 || P3 == lh9Var) {
                Iterator it = list.iterator();
                while (true) {
                    str2 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (c16.i(str, ((vmc) obj).a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                vmc vmcVar = (vmc) obj;
                if (vmcVar != null) {
                    str2 = vmcVar.b;
                }
                if (str2 == null) {
                    P3 = "";
                } else {
                    P3 = str2;
                }
                rv4Var2.o0(P3);
            }
            String str3 = (String) P3;
            nq7 m2 = zj0.m(kq7Var, w06.b);
            gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, m2);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a4);
            jce.F(qw1.e, rv4Var2, l4);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode3));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p4);
            rv4Var2.e0(162133289);
            if (str3.length() == 0) {
                str3 = yqe.A((y3b) v1b.j0.getValue(), rv4Var2);
            }
            String str4 = str3;
            rv4Var2.q(false);
            tza tzaVar = j27.a;
            cvb.c(str4, l0e.u(new we6(1.0f, true)), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 0, 24576, 113656);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, 0), null, pna.n(kq7Var, 16.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, 432, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            rv4Var.q(true);
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new clc(aw7Var, 0);
                rv4Var.o0(P4);
            }
            iue.e(booleanValue, nk0Var, 0L, kq7Var, nae.e, null, (vt4) P4, jce.E(-1184371292, new ox0(list, str, xt4Var, aw7Var, 6), rv4Var), rv4Var, 14158896, 52);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new px0(i2, 3, xt4Var, nq7Var, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0380  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(java.lang.String r55, java.lang.String r56, defpackage.vt4 r57, defpackage.vt4 r58, defpackage.rv4 r59, int r60) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cae.p(java.lang.String, java.lang.String, vt4, vt4, rv4, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r11.l(r13, r0) == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
        if (defpackage.z1d.D(r14, r1, r0) == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
        if (defpackage.ade.r(r1, r0) == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r11 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.lhd r11, defpackage.fy0 r12, java.lang.String r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cae.q(lhd, fy0, java.lang.String, n42):java.lang.Object");
    }

    public static final eid r(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        if (i2 == 0) {
            return eid.a;
        }
        return eid.b;
    }

    public static long s(int i2, eid eidVar) {
        int i3 = de2.a[eidVar.ordinal()];
        int i4 = -1;
        if (i3 != -1) {
            i4 = 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    xk5.o();
                    return 0L;
                }
            } else {
                i4 = 0;
            }
        }
        return (i2 << 32) | (i4 & 4294967295L);
    }

    public static final long t(psa psaVar, long j2) {
        psaVar.getClass();
        psaVar.request(j2);
        long min = Math.min(j2, psaVar.b().c);
        psaVar.b().skip(min);
        return min;
    }

    public static final long u(psa psaVar) {
        psaVar.getClass();
        return psaVar.b().c;
    }

    public static final he2 v(hn4 hn4Var, int i2) {
        int ordinal = hn4Var.M1().ordinal();
        he2 he2Var = he2.a;
        if (ordinal != 0) {
            he2 he2Var2 = he2.b;
            he2 he2Var3 = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        xk5.o();
                        return null;
                    }
                } else {
                    return he2Var2;
                }
            } else {
                hn4 n2 = dae.n(hn4Var);
                if (n2 != null) {
                    he2 v = v(n2, i2);
                    if (v != he2Var) {
                        he2Var3 = v;
                    }
                    if (he2Var3 == null) {
                        if (!hn4Var.M) {
                            hn4Var.M = true;
                            try {
                                vm4 J1 = hn4Var.J1();
                                b61 b61Var = new b61(i2);
                                rm4 rm4Var = (rm4) ((rg) voe.w(hn4Var)).getFocusOwner();
                                hn4 f2 = rm4Var.f();
                                J1.k.invoke(b61Var);
                                hn4 f3 = rm4Var.f();
                                if (b61Var.b) {
                                    zm4 zm4Var = zm4.b;
                                    return he2Var2;
                                } else if (f2 != f3 && f3 != null) {
                                    if (zm4.d == zm4.c) {
                                        return he2Var2;
                                    }
                                    return he2.c;
                                } else {
                                    return he2Var;
                                }
                            } finally {
                                hn4Var.M = false;
                            }
                        }
                        return he2Var;
                    }
                    return he2Var3;
                }
                vs.m("ActiveParent with no focused child");
                return null;
            }
        }
        return he2Var;
    }

    public static final he2 w(hn4 hn4Var, int i2) {
        if (!hn4Var.N) {
            hn4Var.N = true;
            try {
                vm4 J1 = hn4Var.J1();
                b61 b61Var = new b61(i2);
                rm4 rm4Var = (rm4) ((rg) voe.w(hn4Var)).getFocusOwner();
                hn4 f2 = rm4Var.f();
                J1.j.invoke(b61Var);
                hn4 f3 = rm4Var.f();
                boolean z = b61Var.b;
                he2 he2Var = he2.b;
                if (z) {
                    zm4 zm4Var = zm4.b;
                    return he2Var;
                } else if (f2 != f3 && f3 != null) {
                    if (zm4.d == zm4.c) {
                        return he2Var;
                    }
                    return he2.c;
                }
            } finally {
                hn4Var.N = false;
            }
        }
        return he2.a;
    }

    public static final he2 x(hn4 hn4Var, int i2) {
        hn4 hn4Var2;
        kn knVar;
        int ordinal = hn4Var.M1().ordinal();
        he2 he2Var = he2.a;
        if (ordinal != 0) {
            he2 he2Var2 = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!hn4Var.a.J) {
                            lv5.c("visitAncestors called on an unattached node");
                        }
                        mq7 mq7Var = hn4Var.a.e;
                        od6 v = voe.v(hn4Var);
                        loop0: while (true) {
                            if (v != null) {
                                if ((((mq7) v.c0.C).d & 1024) != 0) {
                                    while (mq7Var != null) {
                                        if ((mq7Var.c & 1024) != 0) {
                                            hn4Var2 = mq7Var;
                                            gw7 gw7Var = null;
                                            while (hn4Var2 != null) {
                                                if (hn4Var2 instanceof hn4) {
                                                    break loop0;
                                                }
                                                if ((hn4Var2.c & 1024) != 0 && (hn4Var2 instanceof m03)) {
                                                    int i3 = 0;
                                                    for (mq7 mq7Var2 = ((m03) hn4Var2).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                                                        if ((mq7Var2.c & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                hn4Var2 = mq7Var2;
                                                            } else {
                                                                if (gw7Var == null) {
                                                                    gw7Var = new gw7(new mq7[16], 0);
                                                                }
                                                                if (hn4Var2 != null) {
                                                                    gw7Var.b(hn4Var2);
                                                                    hn4Var2 = null;
                                                                }
                                                                gw7Var.b(mq7Var2);
                                                            }
                                                        }
                                                    }
                                                    if (i3 == 1) {
                                                    }
                                                }
                                                hn4Var2 = voe.h(gw7Var);
                                            }
                                            continue;
                                        }
                                        mq7Var = mq7Var.e;
                                    }
                                }
                                v = v.v();
                                if (v != null && (knVar = v.c0) != null) {
                                    mq7Var = (hkb) knVar.f;
                                } else {
                                    mq7Var = null;
                                }
                            } else {
                                hn4Var2 = null;
                                break;
                            }
                        }
                        hn4 hn4Var3 = hn4Var2;
                        if (hn4Var3 == null) {
                            return he2Var;
                        }
                        int ordinal2 = hn4Var3.M1().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        he2 x = x(hn4Var3, i2);
                                        if (x != he2Var) {
                                            he2Var2 = x;
                                        }
                                        if (he2Var2 == null) {
                                            return w(hn4Var3, i2);
                                        }
                                        return he2Var2;
                                    }
                                    xk5.o();
                                    return null;
                                }
                                return he2.b;
                            }
                            return x(hn4Var3, i2);
                        }
                        return w(hn4Var3, i2);
                    }
                    xk5.o();
                    return null;
                }
            } else {
                hn4 n2 = dae.n(hn4Var);
                if (n2 != null) {
                    return v(n2, i2);
                }
                vs.m("ActiveParent with no focused child");
                return null;
            }
        }
        return he2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [gw7] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [mq7] */
    /* JADX WARN: Type inference failed for: r6v9, types: [mq7] */
    public static final boolean y(hn4 hn4Var) {
        gw7 gw7Var;
        dn4 dn4Var;
        m03 m03Var;
        kn knVar;
        rm4 rm4Var;
        boolean z;
        mq7 h2;
        int i2;
        gw7 gw7Var2;
        Boolean bool;
        int i3;
        int i4;
        kn knVar2;
        rm4 rm4Var2 = (rm4) ((rg) voe.w(hn4Var)).getFocusOwner();
        hn4 f2 = rm4Var2.f();
        dn4 M1 = hn4Var.M1();
        if (f2 == hn4Var) {
            hn4Var.I1(M1, M1);
            return true;
        } else if ((f2 == null || f2.K) && !hn4Var.K && !((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).a.I()) {
            return false;
        } else {
            if (f2 != null) {
                gw7Var = new gw7(new hn4[16], 0);
                if (!f2.a.J) {
                    lv5.c("visitAncestors called on an unattached node");
                }
                mq7 mq7Var = f2.a.e;
                od6 v = voe.v(f2);
                while (v != null) {
                    if ((((mq7) v.c0.C).d & 1024) != 0) {
                        while (mq7Var != null) {
                            if ((mq7Var.c & 1024) != 0) {
                                mq7 mq7Var2 = mq7Var;
                                gw7 gw7Var3 = null;
                                while (mq7Var2 != null) {
                                    if (mq7Var2 instanceof hn4) {
                                        gw7Var.b((hn4) mq7Var2);
                                    } else if ((mq7Var2.c & 1024) != 0 && (mq7Var2 instanceof m03)) {
                                        int i5 = 0;
                                        for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                            if ((mq7Var3.c & 1024) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    mq7Var2 = mq7Var3;
                                                } else {
                                                    if (gw7Var3 == null) {
                                                        gw7Var3 = new gw7(new mq7[16], 0);
                                                    }
                                                    if (mq7Var2 != null) {
                                                        gw7Var3.b(mq7Var2);
                                                        mq7Var2 = null;
                                                    }
                                                    gw7Var3.b(mq7Var3);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    mq7Var2 = voe.h(gw7Var3);
                                }
                            }
                            mq7Var = mq7Var.e;
                        }
                    }
                    v = v.v();
                    if (v != null && (knVar2 = v.c0) != null) {
                        mq7Var = (hkb) knVar2.f;
                    } else {
                        mq7Var = null;
                    }
                }
            } else {
                gw7Var = null;
            }
            hn4[] hn4VarArr = new hn4[16];
            hn4[] hn4VarArr2 = new hn4[16];
            if (!hn4Var.a.J) {
                lv5.c("visitAncestors called on an unattached node");
            }
            ?? r6 = hn4Var.a.e;
            od6 v2 = voe.v(hn4Var);
            boolean z2 = true;
            int i6 = 0;
            int i7 = 0;
            m03 m03Var2 = r6;
            while (v2 != null) {
                if ((((mq7) v2.c0.C).d & 1024) != 0) {
                    for (m03 m03Var3 = m03Var2; m03Var3 != null; m03Var3 = m03Var3.e) {
                        if ((m03Var3.c & 1024) != 0) {
                            m03 m03Var4 = m03Var3;
                            gw7 gw7Var4 = null;
                            while (m03Var4 != null) {
                                if (m03Var4 instanceof hn4) {
                                    hn4 hn4Var2 = (hn4) m03Var4;
                                    if (gw7Var != null) {
                                        bool = Boolean.valueOf(gw7Var.j(hn4Var2));
                                    } else {
                                        bool = null;
                                    }
                                    if (c16.i(bool, Boolean.TRUE)) {
                                        int i8 = i6 + 1;
                                        if (hn4VarArr.length < i8) {
                                            int length = hn4VarArr.length;
                                            rm4Var = rm4Var2;
                                            ?? r1 = new Object[Math.max(i8, length * 2)];
                                            i4 = i8;
                                            System.arraycopy(hn4VarArr, 0, r1, 0, length);
                                            hn4VarArr = r1;
                                        } else {
                                            rm4Var = rm4Var2;
                                            i4 = i8;
                                        }
                                        hn4VarArr[i6] = hn4Var2;
                                        i6 = i4;
                                    } else {
                                        rm4Var = rm4Var2;
                                        int i9 = i7 + 1;
                                        if (hn4VarArr2.length < i9) {
                                            int length2 = hn4VarArr2.length;
                                            ?? r5 = new Object[Math.max(i9, length2 * 2)];
                                            i3 = i9;
                                            System.arraycopy(hn4VarArr2, 0, r5, 0, length2);
                                            hn4VarArr2 = r5;
                                        } else {
                                            i3 = i9;
                                        }
                                        hn4VarArr2[i7] = hn4Var2;
                                        i7 = i3;
                                    }
                                    if (hn4Var2 == f2) {
                                        z2 = false;
                                    }
                                    z = false;
                                } else {
                                    rm4Var = rm4Var2;
                                    z = true;
                                }
                                if (z && (m03Var4.c & 1024) != 0 && (m03Var4 instanceof m03)) {
                                    mq7 mq7Var4 = m03Var4.L;
                                    int i10 = 0;
                                    h2 = m03Var4;
                                    while (mq7Var4 != null) {
                                        if ((mq7Var4.c & 1024) != 0) {
                                            int i11 = i10 + 1;
                                            if (i11 == 1) {
                                                h2 = mq7Var4;
                                                i2 = i11;
                                            } else {
                                                if (gw7Var4 == null) {
                                                    i2 = i11;
                                                    gw7Var2 = new gw7(new mq7[16], 0);
                                                } else {
                                                    i2 = i11;
                                                    gw7Var2 = gw7Var4;
                                                }
                                                if (h2 != 0) {
                                                    gw7Var2.b(h2);
                                                    h2 = 0;
                                                }
                                                gw7Var2.b(mq7Var4);
                                                gw7Var4 = gw7Var2;
                                                h2 = h2;
                                            }
                                            i10 = i2;
                                        }
                                        mq7Var4 = mq7Var4.f;
                                        h2 = h2;
                                    }
                                    if (i10 == 1) {
                                        rm4Var2 = rm4Var;
                                        m03Var4 = h2;
                                    }
                                }
                                h2 = voe.h(gw7Var4);
                                rm4Var2 = rm4Var;
                                m03Var4 = h2;
                            }
                        }
                        rm4Var2 = rm4Var2;
                    }
                }
                rm4 rm4Var3 = rm4Var2;
                v2 = v2.v();
                if (v2 != null && (knVar = v2.c0) != null) {
                    m03Var = (hkb) knVar.f;
                } else {
                    m03Var = null;
                }
                rm4Var2 = rm4Var3;
                m03Var2 = m03Var;
            }
            rm4 rm4Var4 = rm4Var2;
            if (!z2 || f2 == null || z(f2, false)) {
                iue.R(hn4Var, new ik(hn4Var, 10));
                int ordinal = hn4Var.M1().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                xk5.o();
                                return false;
                            }
                        }
                    }
                    ((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).i(hn4Var);
                }
                dn4 dn4Var2 = dn4.c;
                dn4 dn4Var3 = dn4.a;
                if (z2 && f2 != null) {
                    f2.I1(dn4Var3, dn4Var2);
                }
                dn4 dn4Var4 = dn4.b;
                if (gw7Var != null) {
                    int i12 = gw7Var.c - 1;
                    Object[] objArr = gw7Var.a;
                    if (i12 < objArr.length) {
                        while (i12 >= 0) {
                            hn4 hn4Var3 = (hn4) objArr[i12];
                            if (rm4Var4.f() != hn4Var) {
                                break;
                            }
                            hn4Var3.I1(dn4Var4, dn4Var2);
                            i12--;
                        }
                    }
                }
                int i13 = i7 - 1;
                if (i13 < hn4VarArr2.length) {
                    while (i13 >= 0) {
                        hn4 hn4Var4 = hn4VarArr2[i13];
                        if (rm4Var4.f() != hn4Var) {
                            break;
                        }
                        if (hn4Var4 == f2) {
                            dn4Var = dn4Var3;
                        } else {
                            dn4Var = dn4Var2;
                        }
                        hn4Var4.I1(dn4Var, dn4Var4);
                        i13--;
                    }
                }
                if (rm4Var4.f() == hn4Var) {
                    hn4Var.I1(M1, dn4Var3);
                    if (rm4Var4.f() != hn4Var) {
                        break;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static final boolean z(hn4 hn4Var, boolean z) {
        boolean z2;
        int ordinal = hn4Var.M1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        xk5.o();
                        return false;
                    }
                } else {
                    return z;
                }
            } else {
                hn4 n2 = dae.n(hn4Var);
                if (n2 != null) {
                    z2 = z(n2, z);
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                hn4Var.I1(dn4.b, dn4.c);
                return true;
            }
        }
        return true;
    }
}
