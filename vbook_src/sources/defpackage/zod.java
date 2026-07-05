package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zod  reason: default package */
/* loaded from: classes3.dex */
public interface zod extends Closeable, Iterator, j76 {
    default boolean Q0() {
        if (((oa6) this).G() == EventType.START_ELEMENT) {
            return true;
        }
        return false;
    }
}
