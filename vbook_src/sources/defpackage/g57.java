package defpackage;

import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g57  reason: default package */
/* loaded from: classes3.dex */
public abstract class g57 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (g57.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
