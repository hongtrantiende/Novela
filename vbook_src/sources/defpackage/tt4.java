package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt4  reason: default package */
/* loaded from: classes.dex */
public final class tt4 extends LinkedHashMap {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt4(float f, int i, int i2, boolean z) {
        super(i, f, z);
        this.a = i2;
    }

    public static Matcher a(tt4 tt4Var, String str, Pattern pattern) {
        Matcher matcher = (Matcher) tt4Var.get(pattern);
        if (matcher == null) {
            Matcher matcher2 = pattern.matcher(str);
            tt4Var.put(pattern, matcher2);
            return matcher2;
        }
        matcher.reset(str);
        return matcher;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (size() > 4) {
                    return true;
                }
                return false;
            default:
                if (size() > 32) {
                    return true;
                }
                return false;
        }
    }
}
