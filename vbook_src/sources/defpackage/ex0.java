package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ex0  reason: default package */
/* loaded from: classes3.dex */
public final class ex0 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex0(Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                m82 m82Var = (m82) obj;
                pvc pvcVar2 = (pvc) obj2;
                return new ex0((lhd) this.c, (m42) obj3, 0).invokeSuspend(pvcVar);
            case 1:
                tj4 tj4Var = (tj4) obj;
                Throwable th = (Throwable) obj2;
                return new ex0((gh2) this.c, (m42) obj3, 1).invokeSuspend(pvcVar);
            default:
                ((Boolean) obj2).getClass();
                ex0 ex0Var = new ex0(3, (m42) obj3);
                ex0Var.c = (rh9) obj;
                return ex0Var.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                lhd lhdVar = (lhd) this.c;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                if (!lhdVar.j() && lhdVar.f() != null) {
                    this.b = 1;
                    if (lhdVar.e("\n        (function() {\n            var SKIP = { SCRIPT:1, STYLE:1, NOSCRIPT:1, CODE:1, PRE:1, TEXTAREA:1, IFRAME:1, SVG:1 };\n            // Translatable attributes per element.\n            var ATTRS = ['placeholder', 'alt', 'title', 'aria-label'];\n            if (!window.__vb) {\n                window.__vb = { entries: {}, counter: 0, observer: null };\n            }\n            var vb = window.__vb;\n            var chunk = [];\n            function flush() {\n                if (!chunk.length) return;\n                _callNativeFunction(JSON.stringify(['vbookTranslateCollect', JSON.stringify(chunk)]));\n                chunk = [];\n            }\n            function register(node, attr, value) {\n                var id = vb.counter++;\n                vb.entries[id] = { node: node, attr: attr, orig: value };\n                chunk.push({ id: String(id), text: value.trim() });\n                if (chunk.length >= 20) flush();\n            }\n            function collectAttrs(el) {\n                if (!el.getAttribute) return;\n                if (el.__vbAttr) return;\n                var did = false;\n                for (var i = 0; i < ATTRS.length; i++) {\n                    var v = el.getAttribute(ATTRS[i]);\n                    if (v && v.trim()) { register(el, ATTRS[i], v); did = true; }\n                }\n                // <input type=submit|button value=\"...\"> label.\n                if (el.tagName === 'INPUT') {\n                    var ty = (el.getAttribute('type') || '').toLowerCase();\n                    if ((ty === 'submit' || ty === 'button') && el.value && el.value.trim()) {\n                        register(el, 'value', el.value); did = true;\n                    }\n                }\n                if (did) el.__vbAttr = true;\n            }\n            function collectTree(root) {\n                // Text nodes.\n                var walker = document.createTreeWalker(root, NodeFilter.SHOW_TEXT, {\n                    acceptNode: function(node) {\n                        var p = node.parentElement;\n                        if (!p || SKIP[p.tagName]) return NodeFilter.FILTER_REJECT;\n                        if (node.__vbId != null) return NodeFilter.FILTER_REJECT;\n                        var t = node.nodeValue;\n                        return (t && t.trim()) ? NodeFilter.FILTER_ACCEPT : NodeFilter.FILTER_REJECT;\n                    }\n                });\n                var n;\n                while ((n = walker.nextNode())) {\n                    n.__vbId = vb.counter;\n                    register(n, null, n.nodeValue);\n                }\n                // Element attributes.\n                var elWalker = document.createTreeWalker(root, NodeFilter.SHOW_ELEMENT, {\n                    acceptNode: function(el) {\n                        return SKIP[el.tagName] ? NodeFilter.FILTER_REJECT : NodeFilter.FILTER_ACCEPT;\n                    }\n                });\n                if (root.nodeType === 1) collectAttrs(root);\n                var e;\n                while ((e = elWalker.nextNode())) collectAttrs(e);\n            }\n\n            // <title> lives in <head>, outside body. Setting its text node value\n            // updates document.title (tab title).\n            var titleNode = document.querySelector('title');\n            titleNode = titleNode && titleNode.firstChild;\n            if (titleNode && titleNode.__vbId == null && titleNode.nodeValue && titleNode.nodeValue.trim()) {\n                titleNode.__vbId = vb.counter;\n                register(titleNode, null, titleNode.nodeValue);\n            }\n\n            collectTree(document.body);\n            flush();\n\n            // Re-collect content inserted after the first pass (lazy / scroll).\n            if (!vb.observer) {\n                var pending = false;\n                vb.observer = new MutationObserver(function() {\n                    if (pending) return;\n                    pending = true;\n                    setTimeout(function() {\n                        pending = false;\n                        var c2 = [];\n                        // Reuse collectTree but it pushes into the outer `chunk`;\n                        // run a fresh pass over the whole body (already-tagged\n                        // nodes are skipped) and flush.\n                        chunk = c2;\n                        collectTree(document.body);\n                        if (chunk.length) flush();\n                    }, 300);\n                });\n                vb.observer.observe(document.body, { childList: true, subtree: true });\n            }\n        })();\n    ", this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (gh2.b((gh2) this.c, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object b = ((rh9) this.c).b(this);
                if (b == n82Var) {
                    return n82Var;
                }
                return b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex0(int i, m42 m42Var) {
        super(i, m42Var);
        this.a = 2;
    }
}
