package defpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: waa  reason: default package */
/* loaded from: classes.dex */
public final class waa implements w9a {
    public final eba a;

    public waa(eba ebaVar) {
        ebaVar.getClass();
        this.a = ebaVar;
    }

    @Override // defpackage.w9a
    public final Object b() {
        return new vaa(this.a.a(null), null, null);
    }

    @Override // defpackage.w9a
    public final void c(Object obj, kj9 kj9Var) {
        ((FileOutputStream) kj9Var.b).write(r4b.H(r36.d.b(vaa.Companion.serializer(), (vaa) obj)));
    }

    @Override // defpackage.w9a
    public final Object h(FileInputStream fileInputStream) {
        try {
            q36 q36Var = r36.d;
            String F = r4b.F(gae.n(fileInputStream));
            q36Var.getClass();
            return (vaa) q36Var.a(vaa.Companion.serializer(), F);
        } catch (Exception e) {
            throw new IOException("Cannot parse session data", e);
        }
    }
}
