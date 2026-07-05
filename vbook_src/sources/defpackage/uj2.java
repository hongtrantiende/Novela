package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uj2  reason: default package */
/* loaded from: classes.dex */
public abstract class uj2 {
    public static final List a = tl1.B("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz");

    public static final jv4 a(String str) {
        String obj = k4b.N0(str).toString();
        for (String str2 : a) {
            try {
                return new fje(str2, 3).c(str);
            } catch (k16 unused) {
            }
        }
        xk5.p(obj, "Failed to parse date: ");
        return null;
    }
}
