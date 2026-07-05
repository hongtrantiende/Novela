package defpackage;

import java.nio.charset.Charset;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wg5  reason: default package */
/* loaded from: classes3.dex */
public final class wg5 extends aab implements mu4 {
    public /* synthetic */ gh5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Charset d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg5(String str, Charset charset, m42 m42Var) {
        super(3, m42Var);
        this.c = str;
        this.d = charset;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        wg5 wg5Var = new wg5(this.c, this.d, (m42) obj3);
        wg5Var.a = (gh5) obj;
        wg5Var.b = obj2;
        return wg5Var.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        e32 e32Var;
        Charset charset;
        gh5 gh5Var = this.a;
        Object obj2 = this.b;
        hre.r(obj);
        pw6 pw6Var = yg5.a;
        String str = this.c;
        if (str != null && gh5Var.c.v("Accept-Charset") == null) {
            pw6 pw6Var2 = yg5.a;
            StringBuilder o = a82.o("Adding Accept-Charset=", str, " to ");
            o.append(gh5Var.a);
            pw6Var2.i(o.toString());
            gh5Var.c.H("Accept-Charset", str);
        }
        if (obj2 instanceof String) {
            e32 A = oue.A(gh5Var);
            if (A != null && !c16.i(A.c, d32.a.c)) {
                return null;
            }
            String str2 = (String) obj2;
            if (A == null) {
                e32Var = d32.a;
            } else {
                e32Var = A;
            }
            if (A == null || (charset = h32.a(A)) == null) {
                charset = this.d;
            }
            pw6 pw6Var3 = yg5.a;
            pw6Var3.i("Sending request body to " + gh5Var.a + " as text/plain with charset " + charset);
            Set set = h32.a;
            e32Var.getClass();
            charset.getClass();
            String name = charset.name();
            name.getClass();
            return new onb(str2, e32Var.c(name));
        }
        return null;
    }
}
