package defpackage;

import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cx8  reason: default package */
/* loaded from: classes3.dex */
public final class cx8 implements s76 {
    public static final cx8 a = new Object();
    public static final y59 b = aze.e("io.github.vinceglb.filekit.PlatformFile", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        bx8 bx8Var = (bx8) obj;
        bx8Var.getClass();
        jbeVar.I(fpe.p(bx8Var));
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        String s = yq2Var.s();
        s.getClass();
        if (!r4b.Q(s, "content://", true) && !r4b.Q(s, "file://", true)) {
            return new bx8(new zi(new File(s)));
        }
        Uri parse = Uri.parse(s);
        parse.getClass();
        return fpe.k(parse);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
