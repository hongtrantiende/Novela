package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ax0  reason: default package */
/* loaded from: classes3.dex */
public final class ax0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lhd c;
    public final /* synthetic */ fy0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax0(lhd lhdVar, fy0 fy0Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lhdVar;
        this.d = fy0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        fy0 fy0Var = this.d;
        lhd lhdVar = this.c;
        switch (i) {
            case 0:
                return new ax0(lhdVar, fy0Var, m42Var, 0);
            default:
                return new ax0(lhdVar, fy0Var, m42Var, 1);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((ax0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ax0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r3.e("\n        (function() {\n            var vb = window.__vb;\n            if (!vb) return;\n            if (vb.observer) { vb.observer.disconnect(); vb.observer = null; }\n            for (var id in vb.entries) {\n                var e = vb.entries[id];\n                if (!e || e.orig == null) continue;\n                try {\n                    if (e.attr == null) {\n                        e.node.nodeValue = e.orig;\n                        try { delete e.node.__vbId; } catch (x) { e.node.__vbId = null; }\n                    } else if (e.attr === 'value') {\n                        e.node.value = e.orig;\n                        e.node.__vbAttr = false;\n                    } else {\n                        e.node.setAttribute(e.attr, e.orig);\n                        e.node.__vbAttr = false;\n                    }\n                } catch (x) {}\n            }\n            window.__vb = { entries: {}, counter: 0, observer: null };\n        })();\n    ", r9) == r6) goto L29;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            pvc r1 = defpackage.pvc.a
            fy0 r2 = r9.d
            lhd r3 = r9.c
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            n82 r6 = defpackage.n82.a
            r7 = 1
            switch(r0) {
                case 0: goto L35;
                default: goto L11;
            }
        L11:
            int r0 = r9.b
            if (r0 == 0) goto L20
            if (r0 != r7) goto L1b
            defpackage.hre.r(r10)
            goto L34
        L1b:
            defpackage.vs.k(r5)
            r1 = r4
            goto L34
        L20:
            defpackage.hre.r(r10)
            dx0 r10 = new dx0
            r0 = 0
            r10.<init>(r2, r0)
            r9.b = r7
            java.lang.String r0 = "vbookTranslateCollect"
            java.lang.Object r9 = r3.a(r0, r10, r9)
            if (r9 != r6) goto L34
            r1 = r6
        L34:
            return r1
        L35:
            int r0 = r9.b
            r8 = 2
            if (r0 == 0) goto L4b
            if (r0 == r7) goto L47
            if (r0 != r8) goto L42
            defpackage.hre.r(r10)
            goto L77
        L42:
            defpackage.vs.k(r5)
            r1 = r4
            goto L77
        L47:
            defpackage.hre.r(r10)
            goto L60
        L4b:
            defpackage.hre.r(r10)
            java.lang.String r10 = r3.f()
            if (r10 != 0) goto L55
            goto L77
        L55:
            r9.b = r7
            java.lang.String r10 = "\n        (function() {\n            var vb = window.__vb;\n            if (!vb) return;\n            if (vb.observer) { vb.observer.disconnect(); vb.observer = null; }\n            for (var id in vb.entries) {\n                var e = vb.entries[id];\n                if (!e || e.orig == null) continue;\n                try {\n                    if (e.attr == null) {\n                        e.node.nodeValue = e.orig;\n                        try { delete e.node.__vbId; } catch (x) { e.node.__vbId = null; }\n                    } else if (e.attr === 'value') {\n                        e.node.value = e.orig;\n                        e.node.__vbAttr = false;\n                    } else {\n                        e.node.setAttribute(e.attr, e.orig);\n                        e.node.__vbAttr = false;\n                    }\n                } catch (x) {}\n            }\n            window.__vb = { entries: {}, counter: 0, observer: null };\n        })();\n    "
            java.lang.Object r10 = r3.e(r10, r9)
            if (r10 != r6) goto L60
            goto L76
        L60:
            cza r10 = r2.F
            java.lang.Object r10 = r10.getValue()
            wx0 r10 = (defpackage.wx0) r10
            boolean r10 = r10.a
            if (r10 == 0) goto L77
            r9.b = r8
            java.lang.String r10 = "\n        (function() {\n            var SKIP = { SCRIPT:1, STYLE:1, NOSCRIPT:1, CODE:1, PRE:1, TEXTAREA:1, IFRAME:1, SVG:1 };\n            // Translatable attributes per element.\n            var ATTRS = ['placeholder', 'alt', 'title', 'aria-label'];\n            if (!window.__vb) {\n                window.__vb = { entries: {}, counter: 0, observer: null };\n            }\n            var vb = window.__vb;\n            var chunk = [];\n            function flush() {\n                if (!chunk.length) return;\n                _callNativeFunction(JSON.stringify(['vbookTranslateCollect', JSON.stringify(chunk)]));\n                chunk = [];\n            }\n            function register(node, attr, value) {\n                var id = vb.counter++;\n                vb.entries[id] = { node: node, attr: attr, orig: value };\n                chunk.push({ id: String(id), text: value.trim() });\n                if (chunk.length >= 20) flush();\n            }\n            function collectAttrs(el) {\n                if (!el.getAttribute) return;\n                if (el.__vbAttr) return;\n                var did = false;\n                for (var i = 0; i < ATTRS.length; i++) {\n                    var v = el.getAttribute(ATTRS[i]);\n                    if (v && v.trim()) { register(el, ATTRS[i], v); did = true; }\n                }\n                // <input type=submit|button value=\"...\"> label.\n                if (el.tagName === 'INPUT') {\n                    var ty = (el.getAttribute('type') || '').toLowerCase();\n                    if ((ty === 'submit' || ty === 'button') && el.value && el.value.trim()) {\n                        register(el, 'value', el.value); did = true;\n                    }\n                }\n                if (did) el.__vbAttr = true;\n            }\n            function collectTree(root) {\n                // Text nodes.\n                var walker = document.createTreeWalker(root, NodeFilter.SHOW_TEXT, {\n                    acceptNode: function(node) {\n                        var p = node.parentElement;\n                        if (!p || SKIP[p.tagName]) return NodeFilter.FILTER_REJECT;\n                        if (node.__vbId != null) return NodeFilter.FILTER_REJECT;\n                        var t = node.nodeValue;\n                        return (t && t.trim()) ? NodeFilter.FILTER_ACCEPT : NodeFilter.FILTER_REJECT;\n                    }\n                });\n                var n;\n                while ((n = walker.nextNode())) {\n                    n.__vbId = vb.counter;\n                    register(n, null, n.nodeValue);\n                }\n                // Element attributes.\n                var elWalker = document.createTreeWalker(root, NodeFilter.SHOW_ELEMENT, {\n                    acceptNode: function(el) {\n                        return SKIP[el.tagName] ? NodeFilter.FILTER_REJECT : NodeFilter.FILTER_ACCEPT;\n                    }\n                });\n                if (root.nodeType === 1) collectAttrs(root);\n                var e;\n                while ((e = elWalker.nextNode())) collectAttrs(e);\n            }\n\n            // <title> lives in <head>, outside body. Setting its text node value\n            // updates document.title (tab title).\n            var titleNode = document.querySelector('title');\n            titleNode = titleNode && titleNode.firstChild;\n            if (titleNode && titleNode.__vbId == null && titleNode.nodeValue && titleNode.nodeValue.trim()) {\n                titleNode.__vbId = vb.counter;\n                register(titleNode, null, titleNode.nodeValue);\n            }\n\n            collectTree(document.body);\n            flush();\n\n            // Re-collect content inserted after the first pass (lazy / scroll).\n            if (!vb.observer) {\n                var pending = false;\n                vb.observer = new MutationObserver(function() {\n                    if (pending) return;\n                    pending = true;\n                    setTimeout(function() {\n                        pending = false;\n                        var c2 = [];\n                        // Reuse collectTree but it pushes into the outer `chunk`;\n                        // run a fresh pass over the whole body (already-tagged\n                        // nodes are skipped) and flush.\n                        chunk = c2;\n                        collectTree(document.body);\n                        if (chunk.length) flush();\n                    }, 300);\n                });\n                vb.observer.observe(document.body, { childList: true, subtree: true });\n            }\n        })();\n    "
            java.lang.Object r9 = r3.e(r10, r9)
            if (r9 != r6) goto L77
        L76:
            r1 = r6
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
