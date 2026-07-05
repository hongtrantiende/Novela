package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iad  reason: default package */
/* loaded from: classes3.dex */
public final class iad extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pgd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iad(pgd pgdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = pgdVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new iad(this.c, m42Var, 0);
            default:
                return new iad(this.c, m42Var, 1);
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
                return ((iad) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((iad) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pgd pgdVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object a = pgdVar.a("(function() {\n    var video = document.querySelector('video');\n    if (video) {\n        return video.currentSrc || video.src || '';\n    }\n    var source = document.querySelector('video source, source');\n    if (source) {\n        return source.src || '';\n    }\n    return '';\n})();", this);
                if (a == n82Var) {
                    return n82Var;
                }
                return a;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object a2 = pgdVar.a("window.scrollTo(0, document.body.scrollHeight);", this);
                if (a2 == n82Var) {
                    return n82Var;
                }
                return a2;
        }
    }
}
