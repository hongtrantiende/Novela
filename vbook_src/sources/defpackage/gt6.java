package defpackage;

import java.lang.annotation.Annotation;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gt6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt6 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ gt6(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return q71.f;
            case 1:
                return new c81("‹ Back", c81.t, "Bold", "Italic", "Underline", "Strikethrough", "Inline Code", "Highlight", "Slash Command", "Hide Keyboard", "Indent Forward", "Indent Backward", "Link", "Apply Link", "Cancel", "Remove Link", "Title", "URL", yae.a);
            case 2:
                return dpe.o();
            case 3:
                return ipe.z();
            case 4:
                ot6 ot6Var = new ot6(new hy(0));
                zi2.c(ot6Var);
                fbe.w(ot6Var, '-');
                zi2.f(ot6Var);
                fbe.w(ot6Var, '-');
                xi2.g(ot6Var);
                return new pt6(ot6Var.build());
            case 5:
                ot6 ot6Var2 = new ot6(new hy(0));
                zi2.c(ot6Var2);
                zi2.f(ot6Var2);
                xi2.g(ot6Var2);
                return new pt6(ot6Var2.build());
            case 6:
                yt6 yt6Var = new yt6(new hy(0));
                d1 d1Var = (d1) qt6.a.getValue();
                d1Var.getClass();
                yt6Var.e(((pt6) d1Var).a);
                fbe.t(yt6Var, new xt4[]{new vb6(24)}, new vb6(25));
                hv6 hv6Var = (hv6) iv6.a.getValue();
                hv6Var.getClass();
                yt6Var.d(hv6Var.a);
                return new zt6(yt6Var.build());
            case 7:
                ly1 ly1Var = gu6.a;
                return qo3.j;
            case 8:
                throw new IllegalStateException("EditorStateHolder not provided. Ensure CascadeEditor is properly initialized.");
            case 9:
                ly1 ly1Var2 = iu6.a;
                return null;
            case 10:
                ly1 ly1Var3 = ku6.a;
                return null;
            case 11:
                ly1 ly1Var4 = lu6.a;
                return null;
            case 12:
                tza tzaVar = mu6.a;
                return null;
            case 13:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 14:
                tza tzaVar2 = ou6.a;
                return null;
            case 15:
                tza tzaVar3 = pu6.a;
                return null;
            case 16:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            case 17:
                ly1 ly1Var5 = tu6.a;
                return null;
            case 18:
                tza tzaVar4 = vu6.a;
                return kh5.R;
            case 19:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 20:
                return new hoa();
            case 21:
                ly1 ly1Var6 = yu6.a;
                return null;
            case 22:
                ly1 ly1Var7 = zu6.a;
                return Boolean.TRUE;
            case 23:
                ly1 ly1Var8 = bv6.a;
                return ks3.a;
            case 24:
                ly1 ly1Var9 = dv6.a;
                return null;
            case 25:
                hy hyVar = new hy(0);
                gv6 gv6Var = new gv6(hyVar);
                lh8 lh8Var = lh8.a;
                hyVar.a(new ri0(new ea5(lh8Var)));
                fbe.w(gv6Var, ':');
                hyVar.a(new ri0(new rc7(lh8Var)));
                fbe.t(gv6Var, new xt4[]{new vb6(26)}, new vb6(27));
                return new hv6(gv6Var.build());
            case 26:
                mu9 mu9Var = new mu9(24, false);
                try {
                    Class<?> cls = Class.forName("android.util.Log");
                    if (!(sw6.c().b() instanceof ex7)) {
                        return new p88(mu9Var);
                    }
                    return new p88(new s26(cls, mu9Var));
                } catch (ClassNotFoundException unused) {
                    return new p88(mu9Var);
                }
            case 27:
                return new m78("com.reader.app.ui.screen.auth.LoginRoute", nx6.INSTANCE, new Annotation[0]);
            case 28:
                return yae.z("");
            default:
                return yae.z("");
        }
    }
}
