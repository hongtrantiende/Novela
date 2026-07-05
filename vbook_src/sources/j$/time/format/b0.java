package j$.time.format;

import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class b0 {
    public static final b0 a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.b0, java.lang.Object] */
    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof b0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Token.TEMPLATE_LITERAL_SUBST;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
