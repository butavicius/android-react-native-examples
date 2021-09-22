import { requireNativeComponent, ViewStyle } from 'react-native';

type InflaterProps = {
  color: string;
  style: ViewStyle;
};

export const InflaterViewManager = requireNativeComponent<InflaterProps>(
'InflaterView'
);

export default InflaterViewManager;
