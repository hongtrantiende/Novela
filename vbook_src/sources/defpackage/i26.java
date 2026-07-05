package defpackage;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i26  reason: default package */
/* loaded from: classes.dex */
public final class i26 extends tc4 {
    /* JADX WARN: Type inference failed for: r5v3, types: [ty5, ry5] */
    public final x17 E(MatchResult matchResult) {
        Matcher matcher;
        if (matchResult instanceof Matcher) {
            matcher = (Matcher) matchResult;
        } else {
            matcher = null;
        }
        if (matcher != null) {
            int start = matcher.start("neg");
            ?? ry5Var = new ry5(start, matcher.end("neg") - 1, 1);
            if (start < 0) {
                return null;
            }
            String group = matcher.group("neg");
            group.getClass();
            return new x17(group, ry5Var);
        }
        xk5.q("Retrieving groups by name is not supported on this platform.");
        return null;
    }
}
