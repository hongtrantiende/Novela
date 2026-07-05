package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ie4  reason: default package */
/* loaded from: classes.dex */
public final class ie4 implements p0b {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();
    public final w9a a;
    public final xt4 b;
    public final vt4 c;

    public ie4(w9a w9aVar, xt4 xt4Var, vt4 vt4Var) {
        this.a = w9aVar;
        this.b = xt4Var;
        this.c = vt4Var;
    }

    @Override // defpackage.p0b
    public final le4 a() {
        File canonicalFile = ((File) this.c.invoke()).getCanonicalFile();
        synchronized (e) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = d;
            if (!linkedHashSet.contains(absolutePath)) {
                absolutePath.getClass();
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return new le4(canonicalFile, this.a, (dz5) this.b.invoke(canonicalFile), new t42(canonicalFile, 18));
    }
}
