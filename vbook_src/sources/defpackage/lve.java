package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lve  reason: default package */
/* loaded from: classes.dex */
public abstract class lve {
    public static final Logger a = Logger.getLogger(lve.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static boolean a() {
        if (b.get()) {
            return true;
        }
        return false;
    }
}
