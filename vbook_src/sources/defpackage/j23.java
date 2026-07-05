package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j23  reason: default package */
/* loaded from: classes3.dex */
public final class j23 {
    public final ConcurrentHashMap a;

    public j23(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap();
                return;
            default:
                this.a = new ConcurrentHashMap(16);
                return;
        }
    }
}
