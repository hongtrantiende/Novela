package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c2d  reason: default package */
/* loaded from: classes.dex */
public final class c2d {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static c2d c;
    public final fn8 a;

    public c2d(fn8 fn8Var) {
        this.a = fn8Var;
    }

    public final boolean a(ad0 ad0Var) {
        if (!TextUtils.isEmpty(ad0Var.c)) {
            this.a.getClass();
            if (ad0Var.f + ad0Var.e < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
