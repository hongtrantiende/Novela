package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: inc  reason: default package */
/* loaded from: classes.dex */
public final class inc implements hnc {
    public final Set a;
    public final ld0 b;
    public final knc c;

    public inc(Set set, ld0 ld0Var, knc kncVar) {
        this.a = set;
        this.b = ld0Var;
        this.c = kncVar;
    }

    public final jnc a(String str, bt3 bt3Var, nkc nkcVar) {
        Set set = this.a;
        if (set.contains(bt3Var)) {
            return new jnc(this.b, str, bt3Var, nkcVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bt3Var, set));
    }
}
