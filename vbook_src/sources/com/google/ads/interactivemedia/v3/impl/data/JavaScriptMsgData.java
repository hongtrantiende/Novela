package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_JavaScriptMsgData_LogData;
import com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class JavaScriptMsgData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract JavaScriptMsgData build();

        public abstract Builder setAdBreakDuration(Double d);

        public abstract Builder setAdBreakTime(String str);

        public abstract Builder setAdCuePoints(List<Float> list);

        public abstract Builder setAdData(AdData adData);

        public abstract Builder setAdPeriodDuration(Double d);

        public abstract Builder setAdPodInfo(AdPodInfoData adPodInfoData);

        public abstract Builder setAdPosition(Integer num);

        public abstract Builder setAdsDuration(Double d);

        public abstract Builder setAdsDurationsMs(List<Long> list);

        public abstract Builder setAttributionSrc(String str);

        public abstract Builder setAudioMimeType(String str);

        public abstract Builder setBufferedTime(Double d);

        public abstract Builder setClickString(String str);

        public abstract Builder setCompanions(Map<String, CompanionData> map);

        public abstract Builder setCuepoints(List<CuePointData> list);

        public abstract Builder setCurrentTime(Double d);

        public abstract Builder setDuration(Double d);

        public abstract Builder setErrorCode(Integer num);

        public abstract Builder setErrorMessage(String str);

        public abstract Builder setEventId(String str);

        public abstract Builder setIconClickFallbackImages(List<IconClickFallbackImageMsgData> list);

        public abstract Builder setIconsView(IconsViewData iconsViewData);

        public abstract Builder setInnerError(String str);

        public abstract Builder setInternalCuePoints(SortedSet<Float> sortedSet);

        public abstract Builder setLn(String str);

        public abstract Builder setLogData(LogData logData);

        public abstract Builder setM(String str);

        public abstract Builder setMonitorAppLifecycle(Boolean bool);

        public abstract Builder setN(String str);

        public abstract Builder setNetworkRequest(NetworkRequestData networkRequestData);

        public abstract Builder setPauseAdData(PauseAdData pauseAdData);

        public abstract Builder setPauseAdHideData(PauseAdHideData pauseAdHideData);

        public abstract Builder setQueryId(String str);

        public abstract Builder setResizeAndPositionVideo(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData);

        public abstract Builder setSeekTime(Double d);

        public abstract Builder setSkipView(SkipViewData skipViewData);

        public abstract Builder setSlateDuration(Double d);

        public abstract Builder setStreamId(String str);

        public abstract Builder setStreamUrl(String str);

        public abstract Builder setSubtitles(List<HashMap<String, String>> list);

        public abstract Builder setTotalAds(Integer num);

        public abstract Builder setTotalDuration(Double d);

        public abstract Builder setUiConfig(JavaScriptUiConfigData javaScriptUiConfigData);

        public abstract Builder setUrl(String str);

        public abstract Builder setVastEvent(String str);

        public abstract Builder setVideoMimeType(String str);

        public abstract Builder setVideoUrl(String str);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class LogData {

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* loaded from: classes.dex */
        public static abstract class Builder {
            public abstract LogData build();

            public abstract Builder setErrorCode(Integer num);

            public abstract Builder setErrorMessage(String str);

            public abstract Builder setInnerError(String str);

            public abstract Builder setType(String str);
        }

        public static Builder builder() {
            return new AutoValue_JavaScriptMsgData_LogData.Builder();
        }

        public Map<String, String> constructMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("type", type());
            hashMap.put("errorCode", String.valueOf(errorCode()));
            hashMap.put("errorMessage", errorMessage());
            if (innerError() != null) {
                hashMap.put("innerError", innerError());
            }
            return hashMap;
        }

        public abstract Integer errorCode();

        public abstract String errorMessage();

        public abstract String innerError();

        public final String toString() {
            String type = type();
            Integer errorCode = errorCode();
            String errorMessage = errorMessage();
            String innerError = innerError();
            StringBuilder sb = new StringBuilder("Log[type=");
            sb.append(type);
            sb.append(", errorCode=");
            sb.append(errorCode);
            sb.append(", errorMessage=");
            return nk2.w(sb, errorMessage, ", innerError=", innerError, "]");
        }

        public abstract String type();
    }

    public static Builder builder() {
        return new AutoValue_JavaScriptMsgData.Builder();
    }

    public abstract Double adBreakDuration();

    public abstract String adBreakTime();

    public abstract List<Float> adCuePoints();

    public abstract AdData adData();

    public abstract Double adPeriodDuration();

    public abstract AdPodInfoData adPodInfo();

    public abstract Integer adPosition();

    public abstract Double adsDuration();

    public abstract List<Long> adsDurationsMs();

    public abstract String attributionSrc();

    public abstract String audioMimeType();

    public abstract Double bufferedTime();

    public abstract String clickString();

    public abstract Map<String, CompanionData> companions();

    public abstract List<CuePointData> cuepoints();

    public abstract Double currentTime();

    public abstract Double duration();

    public abstract Integer errorCode();

    public abstract String errorMessage();

    public abstract String eventId();

    public abstract List<IconClickFallbackImageMsgData> iconClickFallbackImages();

    public abstract IconsViewData iconsView();

    public abstract String innerError();

    public abstract SortedSet<Float> internalCuePoints();

    public abstract String ln();

    public abstract LogData logData();

    public abstract String m();

    public abstract Boolean monitorAppLifecycle();

    public abstract String n();

    public abstract NetworkRequestData networkRequest();

    public abstract PauseAdData pauseAdData();

    public abstract PauseAdHideData pauseAdHideData();

    public abstract String queryId();

    public abstract ResizeAndPositionVideoMsgData resizeAndPositionVideo();

    public abstract Double seekTime();

    public abstract SkipViewData skipView();

    public abstract Double slateDuration();

    public abstract String streamId();

    public abstract String streamUrl();

    public abstract List<HashMap<String, String>> subtitles();

    public abstract Integer totalAds();

    public abstract Double totalDuration();

    public abstract JavaScriptUiConfigData uiConfig();

    public abstract String url();

    public abstract String vastEvent();

    public abstract String videoMimeType();

    public abstract String videoUrl();
}
